package com.riwi.models;

import com.riwi.entities.EntityVuelo;
import com.riwi.persistences.configDB.ConfigDB;
import com.riwi.persistences.imodel.IVueloModel;

import javax.swing.*;
import java.sql.*;

public class ModelVuelo implements IVueloModel {
    @Override
    public EntityVuelo create(EntityVuelo request) {

        Connection conexion = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO vuelo (destino, fecha_salida, hora_salida, id_avion) values (?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, request.getDestino());
            preparedStatement.setDate(2,request.getFecha_salida());
            preparedStatement.setTime(3,request.getHora_salida());
            preparedStatement.setInt(4,request.getId_avion());


            preparedStatement.execute();

            System.out.println("Query executed!");

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()){
                int idGenerado = resultSet.getInt(1);
                request.setId_vuelo(idGenerado);
            }

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        ConfigDB.closeConnection();

        return request;
    }

    @Override
    public boolean delete(Integer id) {
        Connection conexion = ConfigDB.openConnection();

        boolean estado;

        try {
            String sqlQuery = "DELETE FROM vuelo WHERE id_vuelo = ?;";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            estado = preparedStatement.execute();

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        ConfigDB.closeConnection();

        return estado;
    }

    @Override
    public Object read(Integer id) {

        Connection conexion = ConfigDB.openConnection();

        EntityVuelo vuelo = null;

        try {
            String sqlQuery = "SELECT * FROM vuelo WHERE id_vuelo = ?;";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultado = preparedStatement.getResultSet();

            while (resultado.next()){
                vuelo = new EntityVuelo(

                        resultado.getInt("id_vuelo"),

                        resultado.getString("destino"),

                        resultado.getDate("fecha_salida"),

                        resultado.getTime("hora_salida"),

                        resultado.getInt("id_avion")

                );
            }

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        ConfigDB.closeConnection();

        return vuelo;
    }

    @Override
    public EntityVuelo update(EntityVuelo entityVuelo, Integer id) {

        String sqlQuery = "UPDATE vuelo SET destino = ?, fecha_salida = ?, hora_salida = ?, id_avion = ? WHERE id_vuelo = ?;";

        Connection conexion = ConfigDB.openConnection();

        boolean estado = false;

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setString(1, entityVuelo.getDestino());
            preparedStatement.setDate(2, entityVuelo.getFecha_salida());
            preparedStatement.setTime(3, entityVuelo.getHora_salida());
            preparedStatement.setInt(4, entityVuelo.getId_avion());
            preparedStatement.setInt(5, id);

            int comprobar = preparedStatement.executeUpdate();

            if (comprobar == 1){
                JOptionPane.showMessageDialog(null,"Vuelo editado correctamente");
                estado = true;
            }else{
                JOptionPane.showMessageDialog(null,"Vuelo no encontrado");
            }

            entityVuelo.setId_vuelo(id);

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        return entityVuelo;
    }
}

package com.riwi.models;

import com.riwi.entities.EntityAvion;
import com.riwi.entities.EntityPasajero;
import com.riwi.persistences.configDB.ConfigDB;
import com.riwi.persistences.imodel.IAvionModel;
import com.riwi.persistences.imodel.IPasajeroModel;

import javax.swing.*;
import java.sql.*;

public class ModelPasajero implements IPasajeroModel {
    @Override
    public EntityPasajero create(EntityPasajero request) {

        Connection conexion = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO pasajero(nombre,apellido,documento_identidad) values (?,?,?);";



        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, request.getNombre());
            preparedStatement.setString(2,request.getApellido());
            preparedStatement.setString(3,request.getDocumento_identidad());


            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()){
                int idGenerado = resultSet.getInt(1);
                request.setId_pasajero(idGenerado);
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
            String sqlQuery = "DELETE FROM pasajero WHERE id_pasajero = ?;";

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

        EntityPasajero pasajero = null;

        try {
            String sqlQuery = "SELECT * FROM pasajero WHERE id_pasajero = ?;";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultado = preparedStatement.getResultSet();

            while (resultado.next()){
                pasajero = new EntityPasajero(

                        resultado.getInt("id_pasajero"),

                        resultado.getString("nombre"),


                        resultado.getString("apellido"),

                        resultado.getString("documento_identidad")

                );
            }

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        ConfigDB.closeConnection();

        return pasajero;
    }

    @Override
    public EntityPasajero update(EntityPasajero entityPasajero, Integer id) {

        String sqlQuery = "UPDATE pasajero SET nombre = ?, apellido = ?, documento_identidad = ? WHERE id_pasajero = ?;";

        Connection conexion = ConfigDB.openConnection();

        boolean estado = false;

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setString(1, entityPasajero.getNombre());
            preparedStatement.setString(2, entityPasajero.getApellido());
            preparedStatement.setString(3, entityPasajero.getDocumento_identidad());
            preparedStatement.setInt(4, id);

            int comprobar = preparedStatement.executeUpdate();

            if (comprobar == 1){
                JOptionPane.showMessageDialog(null,"Pasajero editado correctamente");
                estado = true;
            }else{
                JOptionPane.showMessageDialog(null,"Pasajero no encontrado");
            }

            entityPasajero.setId_pasajero(id);

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        return entityPasajero;
    }
}

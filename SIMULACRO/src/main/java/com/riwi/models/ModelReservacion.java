package com.riwi.models;

import com.riwi.entities.EntityReservacion;
import com.riwi.persistences.configDB.ConfigDB;
import com.riwi.persistences.imodel.IReservacionModel;

import javax.swing.*;
import java.sql.*;

public class ModelReservacion implements IReservacionModel {
    @Override
    public EntityReservacion create(EntityReservacion request) {

        Connection conexion = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO reservacion (fecha_reservacion, asiento, id_pasajero, id_vuelo) values (?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setDate(1, request.getFecha_reservacion());
            preparedStatement.setString(2,request.getAsiento());
            preparedStatement.setInt(3,request.getId_pasajero());
            preparedStatement.setInt(4,request.getId_vuelo());


            preparedStatement.execute();

            System.out.println("Query executed!");

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()){
                int idGenerado = resultSet.getInt(1);
                request.setId_reservacion(idGenerado);
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
            String sqlQuery = "DELETE FROM reservacion WHERE id_reservacion = ?;";

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

        EntityReservacion reservacion = null;

        try {
            String sqlQuery = "SELECT * FROM reservacion WHERE id_reservacion = ?;";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultado = preparedStatement.getResultSet();

            while (resultado.next()){
                reservacion = new EntityReservacion(

                        resultado.getInt("id_reservacion"),

                        resultado.getDate("fecha_reservacion"),

                        resultado.getString("asiento"),

                        resultado.getInt("id_pasajero"),

                        resultado.getInt("id_vuelo")

                );
            }

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        ConfigDB.closeConnection();

        return reservacion;
    }

    @Override
    public EntityReservacion update(EntityReservacion entityReservacion, Integer id) {

        String sqlQuery = "UPDATE reservacion SET fecha_reservacion = ?, asiento = ?, id_pasajero = ?, id_vuelo = ? WHERE id_Reservacion = ?;";

        Connection conexion = ConfigDB.openConnection();

        boolean estado = false;

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setDate(1, entityReservacion.getFecha_reservacion());
            preparedStatement.setString(2, entityReservacion.getAsiento());
            preparedStatement.setInt(3, entityReservacion.getId_pasajero());
            preparedStatement.setInt(4, entityReservacion.getId_vuelo());
            preparedStatement.setInt(5, id);

            int comprobar = preparedStatement.executeUpdate();

            if (comprobar == 1){
                JOptionPane.showMessageDialog(null,"Reservacion editada correctamente");
                estado = true;
            }else{
                JOptionPane.showMessageDialog(null,"Reservacion no encontrada");
            }

            entityReservacion.setId_reservacion(id);

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        return entityReservacion;
    }
}

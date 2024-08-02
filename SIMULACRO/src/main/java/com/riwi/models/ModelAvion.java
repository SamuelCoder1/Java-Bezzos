package com.riwi.models;

import com.riwi.entities.EntityAvion;
import com.riwi.persistences.configDB.ConfigDB;
import com.riwi.persistences.imodel.IAvionModel;

import javax.swing.*;
import java.sql.*;

public class ModelAvion implements IAvionModel {
    @Override
    public EntityAvion create(EntityAvion request) {

        Connection conexion = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO avion(modelo,capacidad) values (?,?);";



        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, request.getModelo());
            preparedStatement.setInt(2,request.getCapacidad());

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()){
                int idGenerado = resultSet.getInt(1);
                request.setId_avion(idGenerado);
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
            String sqlQuery = "DELETE FROM avion WHERE id_avion = ?;";

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

        EntityAvion avion = null;

        try {
            String sqlQuery = "SELECT * FROM avion WHERE id_avion = ?;";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultado = preparedStatement.getResultSet();

            while (resultado.next()){
                avion = new EntityAvion(

                    resultado.getInt("id_avion"),

                    resultado.getString("modelo"),

                    resultado.getInt("capacidad")

                );
            }

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        ConfigDB.closeConnection();

        return avion;
    }

    @Override
    public EntityAvion update(EntityAvion entityAvion, Integer id) {

        String sqlQuery = "UPDATE avion SET modelo = ?, capacidad = ? WHERE id_avion = ?;";

        Connection conexion = ConfigDB.openConnection();

        boolean estado = false;

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);

            preparedStatement.setString(1, entityAvion.getModelo());
            preparedStatement.setInt(2, entityAvion.getCapacidad());
            preparedStatement.setInt(3, id);

            int comprobar = preparedStatement.executeUpdate();

            if (comprobar == 1){
                JOptionPane.showMessageDialog(null,"Avion editado correctamente");
                estado = true;
            }else{
                JOptionPane.showMessageDialog(null,"Avion no encontrado");
            }

            entityAvion.setId_avion(id);

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        return entityAvion;
    }
}

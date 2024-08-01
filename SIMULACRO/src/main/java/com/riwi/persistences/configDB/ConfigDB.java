package com.riwi.persistences.configDB;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {

    public static Connection conexion = null;

    public static Connection openConnection(){

        String URL = "jdbc:mysql://localhost:3306/aerolinea";
        String user = "root";
        String password = "Rlwl2023.";

        try {
            conexion = DriverManager.getConnection(URL, user, password);
            JOptionPane.showMessageDialog(null,"Conexion exitosa");

        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        return conexion;
    }

    public static void closeConnection(){

        if (conexion != null){

            try {
                conexion.close();
                System.out.println("Conexion cerrada exitosamente");
            } catch (SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
        }
    }
}

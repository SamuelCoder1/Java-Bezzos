package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class ConfigDB {
    // Connection
    static Connection connection = null;
    // Method to open
    public static Connection openConnection(){
        try {
            // Install Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Credentials
            String URL = "jdbc:mysql://localhost:3306/JDBC";

            String user = "root";

            String password = "Rlwl2023.";

            // Establish the connection
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connection successful");

        } catch (ClassNotFoundException error) {
            throw new RuntimeException(error.getMessage());
        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        }

        return connection;
    }

    // Method to closed

    public static void closeConnection() throws SQLException{
        if (connection != null){
            connection.close();
            connection = null;

            System.out.println("Connection finished");
        }
    }
}

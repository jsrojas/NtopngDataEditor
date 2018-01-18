/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author juan
 */
public class DatabaseConnection {

    public void connectDatabase() {
        try {
            // We register the MySQL driver
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error registering the driver from MySQL: " + ex);
            }
            Connection connection = null;
            // Database connect
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/26_04_4_12pm",
                    "root", "1234");
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    }

}

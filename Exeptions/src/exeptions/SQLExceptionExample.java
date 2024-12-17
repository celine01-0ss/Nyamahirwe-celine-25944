/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;

/**
 *
 * @author admin
 */
import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Connecting to a database and executing an invalid SQL query
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "user", "pass");
            Statement stmt = conn.createStatement();
            stmt.executeQuery("INVALID SQL");
        } catch (SQLException e) {
            // Handling SQLException for database errors
            System.out.println("SQLException occurred: " + e.getMessage());
        }
    }
}




package com.jdbc.main;
import java.sql.*;
import java.util.*;
public class ConnectionClass {
    static String url ="jdbc:mysql://localhost:3306/jdbcdemo";
    static String username="root";
    static String password="Soukhya@123";
    public ConnectionClass(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,username,password);
    }


}

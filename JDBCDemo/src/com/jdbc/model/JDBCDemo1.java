package com.jdbc.model;

import java.sql.*;
public class JDBCDemo1 {
    public static void main(String[] args) {
        //InsertDemo insertDemo = new InsertDemo();
//        DeleteDemo deleteDemo = new DeleteDemo();
//        UpdateDemo updateDemo = new UpdateDemo();
//        JDBCDemo1 jdbcDemo1 = new JDBCDemo1();
        String url ="jdbc:mysql://localhost:3306/jdbcdemo";
        String username="root";
        String password="Soukhya@123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from student");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

package com.jdbc.main;
import java.sql.*;

public class UpdateDemo {
    public static void update(){

       // ConnectionClass connectionClass = new ConnectionClass();
        try (Connection connection= ConnectionClass.getConnection();){

            String sql= "UPDATE student SET name=? where id = 5";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"John");
            int ervalue = preparedStatement.executeUpdate();
            if(ervalue!=0){
                System.out.println("Added");
            }
            else{
                System.out.println("failed");
            }

            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

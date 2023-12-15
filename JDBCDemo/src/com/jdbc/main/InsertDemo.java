package com.jdbc.main;
import java.sql.*;
import java.util.*;

public class InsertDemo {
    public static void insertStudent(String name, String age) {
        //ConnectionClass connectionClass = new ConnectionClass();
        try (Connection connection= ConnectionClass.getConnection();){

            PreparedStatement preparedStatement = connection.prepareStatement("insert into student(name,age) values(?,?)");
            //preparedStatement.setString(1,id);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,age);


            int ervalue = preparedStatement.executeUpdate();
            if(ervalue!=0){
                System.out.println("Added");
            }
            else{
                System.out.println("failed");
            }

            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

package com.jdbc.main;
import java.sql.*;

public class DeleteDemo {
    public static void deleteDemo1(){

       // ConnectionClass connectionClass = new ConnectionClass();
        try (Connection connection= ConnectionClass.getConnection();){

            String query = "delete from student where id = 4";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            int ervalue = preparedStmt.executeUpdate();
            if(ervalue!=0){
                System.out.println("Deleted");
            }
            else{
                System.out.println("failed");
            }
            //System.out.println("Deleted");
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

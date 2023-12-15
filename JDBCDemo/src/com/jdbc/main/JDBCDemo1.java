package com.jdbc.main;
import java.sql.*;
public class JDBCDemo1 {
    public static void read(){

        //ConnectionClass connectionClass = new ConnectionClass();
        try (Connection connection= ConnectionClass.getConnection();){

            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from student");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
            }
            ResultSetMetaData rsMetaData= resultSet.getMetaData();
            System.out.println("\n Number of columns : "+rsMetaData.getColumnCount());
            System.out.println("Table name : "+rsMetaData.getTableName(1));
            System.out.println("column name : "+rsMetaData.getColumnName(1));
            System.out.println("column name : "+rsMetaData.getColumnName(2));
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

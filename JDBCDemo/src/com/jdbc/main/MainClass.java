package com.jdbc.main;
import java.sql.SQLOutput;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {

        boolean continueloop= true;
        while(continueloop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter choice ");
            System.out.println("1.Insert");
            System.out.println("2.Select All");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("5.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: Scanner scan = new Scanner(System.in);
//                    System.out.println("Enter studentId: ");
//                    String id= scan.next();
                    System.out.println("Enter name ");
                    String name= scan.next();
                    System.out.println("Enter age: ");
                    String age=scan.next();
                    InsertDemo.insertStudent(name,age);
                    break;
                case 2: JDBCDemo1.read();
                    break;
                case 3: DeleteDemo.deleteDemo1();
                    break;
                case 4:UpdateDemo.update();
                    break;
                case 5: continueloop = false;
                    break;
            }
        }
    }
}

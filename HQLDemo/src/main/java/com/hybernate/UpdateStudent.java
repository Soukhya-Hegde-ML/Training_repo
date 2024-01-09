package com.hybernate;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class UpdateStudent {
    public static void update(Session session, int updatechoice, Scanner scanner){
        System.out.println("Enter student Id");
        int student_id= scanner.nextInt();
        switch (updatechoice){
            case 1 :
                Transaction transaction= session.beginTransaction();
                Query query = session.createQuery("update Student set first_name= :first_name where student_id= :student_id");

                System.out.println("Enter first name: ");
                String first_name= scanner.next();
                query.setParameter("first_name", first_name);
                query.setParameter("student_id", student_id);
                int result = query.executeUpdate();
                System.out.println("Student Update Status="+result);
                transaction.commit();
                break;
            case 2 :Transaction transaction2= session.beginTransaction();
                query = session.createQuery("update Student set last_name= :last_name where student_id= :student_id");

                System.out.println("Enter last name: ");
                String last_name= scanner.next();
                query.setParameter("last_name", last_name);
                query.setParameter("student_id", student_id);
                int result2 = query.executeUpdate();
                System.out.println("Student Update Status="+result2);
                transaction2.commit();
                break;
            case 3 :Transaction transaction3= session.beginTransaction();
            query = session.createQuery("update Student set email= :email where student_id= :student_id");
                System.out.println("Enter email: ");
                String email= scanner.next();
                query.setParameter("email", email);
                query.setParameter("student_id", student_id);
                int result3 = query.executeUpdate();
                System.out.println("Student Update Status="+result3);
                transaction3.commit();
                break;
        }

    }
}

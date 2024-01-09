package com.hybernate;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertStudent {
    public static void insertStudent(Session session,String first_name,String last_name,String email) {
        //Transaction transaction = session.beginTransaction();

//        String hql = "INSERT INTO Student (first_name, last_name, email)"+
//                "SELECT firstName, lastName, email FROM Student";
//        Query query = session.createQuery(hql,Student.class).setParameter("first_name", first_name).setParameter("last_name", last_name).setParameter("email", email);
//        int result = query.executeUpdate();
//        System.out.println("Rows affected: " + result);
//        transaction.commit();
        System.out.println("Inside insert student: "+first_name+", "+last_name+","+email);
        Student student=new Student();
        student.setFirst_name(first_name);
        student.setLast_name(last_name);
        student.setEmail(email);
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        //session.close();

    }
}

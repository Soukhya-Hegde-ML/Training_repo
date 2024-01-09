package com.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Student student = new Student();
        student.setFirst_name("ABC");
        student.setLast_name("xyz");
        student.setEmail("abc@gmail.com");
        Address address = new Address();
        address.setCity("Bangalore");
        address.setStreet("Koramangala");
        student.setAddress(address);
        session.beginTransaction();
        session.save(student);
        session.save(address);
        session.getTransaction().commit();
        session.close();
    }
}
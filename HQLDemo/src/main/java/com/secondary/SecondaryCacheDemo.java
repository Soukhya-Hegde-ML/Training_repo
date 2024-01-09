package com.secondary;
import com.hybernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondaryCacheDemo {
    public static void main(String[] args) {


        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Student.class);
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session1 = sessionFactory.openSession();
        Student student1 = session1.get(Student.class,1);
        System.out.println(student1);
        session1.close();
        Session session2 = sessionFactory.openSession();
        Student student2 = session1.get(Student.class,1);
        System.out.println(student2);
        session2.close();
    }
}

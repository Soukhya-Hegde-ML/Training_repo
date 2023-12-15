package com.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("Enter genre");
        Scanner scanner = new Scanner(System.in);
        String genre_name=scanner.next();
        Genre genre = new Genre();
        genre.setGenre_name(genre_name);
        session.beginTransaction();
        session.save(genre);
        session.getTransaction().commit();
        System.out.println("Genre has been saved");
    }
}

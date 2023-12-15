package com.hybernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory = null;
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Song.class);
            configuration.addAnnotatedClass(Genre.class);
            configuration.configure();

            sessionFactory = configuration.buildSessionFactory();
        }

        return sessionFactory;
    }
}

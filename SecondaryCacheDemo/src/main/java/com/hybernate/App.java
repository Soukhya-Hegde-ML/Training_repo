package com.hybernate;

import net.sf.ehcache.hibernate.EhCacheRegionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session1 = sessionFactory.openSession();

        session1.close();
        Session session2=sessionFactory.openSession();
        session2.close();
    }
}

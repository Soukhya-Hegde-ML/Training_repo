package com.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        //User user = new User();
        //user.setUser_name("xyz");
        User user2 = new User();
        user2=session.get(User.class,2);
       // user2.setUser_name("abc");
        Vehicle vehicle = new Vehicle();
        //vehicle.setVehicleName("car");
        Vehicle vehicle2 = new Vehicle();
        vehicle = session.get(Vehicle.class,1);
        vehicle2 = session.get(Vehicle.class,2);
        //vehicle2.setVehicleName("Jeep");
        user2.getVehicles().add(vehicle);
        user2.getVehicles().add(vehicle2);
        //vehicle.getUsers().add(user);
       // vehicle.getUsers().add(user2);
        session.beginTransaction();
        //session.save(user);
        session.save(vehicle);
        session.save(vehicle2);
        session.save(user2);
        session.getTransaction().commit();
        session.close();


    }
}

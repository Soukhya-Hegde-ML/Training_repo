package com.hybernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Song song = new Song();

        boolean continueloop = true;
        while(continueloop){
        System.out.println("Enter your choice:");
        System.out.println("1.Insert\n2.Read\n3.update\n4.Delete\n5.exit\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter song name");
                    String song_name = scanner.next();
                    System.out.println("Enter artist name");
                    String artist = scanner.next();
                    song.setSong_name(song_name);
                    song.setArtist(artist);
                    session.beginTransaction();
                    session.save(song);
                    session.getTransaction().commit();
                    System.out.println("song has been saved");
                    break;
                case 2 : song = session.get(Song.class,5);
                    System.out.println(song);
                    break;
                case 3: song = session.get(Song.class,9);
                    song.setSong_name("This Town");
                    song.setArtist("Niall Horan");
                    session.beginTransaction();
                    session.update(song);
                    session.getTransaction().commit();

                    System.out.println("updated song :"+song);
                    break;
                case 4: song = session.get(Song.class,7);
                    System.out.println("Deleting song : "+song);
                    session.beginTransaction();
                    session.delete(song);
                    session.getTransaction().commit();

                    break;
                case 5 :continueloop=false;
                break;
            }
        }



    }
}

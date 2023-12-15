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
                    Song song = new Song();
                    song.setSong_name(song_name);
                    song.setArtist(artist);
                    session.beginTransaction();
                    session.save(song);
                    session.getTransaction().commit();
                    System.out.println("song has been saved");
                    break;
                case 2 : Song song1 = session.get(Song.class,5);
                    System.out.println(song1);
                    break;
                case 3: Song song2 = session.get(Song.class,9);
                    song2.setSong_name("This Town");
                    song2.setArtist("Niall Horan");
                    session.beginTransaction();
                    session.update(song2);
                    session.getTransaction().commit();

                    System.out.println("updated song :"+song2);
                    break;
                case 4: Song song3 = session.get(Song.class,7);
                    System.out.println("Deleting song : "+song3);
                    session.beginTransaction();
                    session.delete(song3);
                    session.getTransaction().commit();

                    break;
                case 5 :continueloop=false;
                break;
            }
        }



    }
}

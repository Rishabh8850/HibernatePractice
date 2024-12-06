package com.rish.hibernate.app;

import com.rish.hibernate.entity.Song;
import com.rish.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class CreateApp
{
    public static void main( String[] args )
    {
        SessionFactory sf = HibernateUtility.getSessionFactory();
        Song song = new Song();
        song.setId(3);
        song.setSongName("Sochenge Tumhe Payar");
        song.setSinger("Kumar Sanu");
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(song);
        session.getTransaction().commit();
        System.out.println("Song Details Saved...");
        session.close();
    }
}

package com.rish.hibernate.app;

import com.rish.hibernate.entity.Song;
import com.rish.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ReadApp {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Song song = session.get(Song.class, 2);
        session.getTransaction().commit();
        System.out.println(song);
        session.close();
    }
}

package com.rish.hibernate.app;

import com.rish.hibernate.entity.Song;
import com.rish.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateApp {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        Session session = sessionFactory.openSession();
        Song song = session.get(Song.class, 2);
        song.setSongName(song.getSongName().toUpperCase());
        session.beginTransaction();
        session.update(song);
        session.getTransaction().commit();
        session.close();
    }
}

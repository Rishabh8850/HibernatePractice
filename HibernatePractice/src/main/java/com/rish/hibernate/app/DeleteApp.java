package com.rish.hibernate.app;

import com.rish.hibernate.entity.Song;
import com.rish.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteApp {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtility.getSessionFactory();
        Session session = sf.openSession();
        Song song = session.get(Song.class, 2);
        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();
        session.close();
    }
}

package com.rish.hibernate.utility;

import com.rish.hibernate.entity.Song;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        try {
            if (sessionFactory == null) {
                Configuration cfg = new Configuration();
                cfg.configure();
                cfg.addAnnotatedClass(Song.class);
                sessionFactory = cfg.buildSessionFactory();
            }
        }
        catch (Exception ex) {
            System.out.println("Could not be able to create Session Factory due to config issue");
        }
        return sessionFactory;
    }
}

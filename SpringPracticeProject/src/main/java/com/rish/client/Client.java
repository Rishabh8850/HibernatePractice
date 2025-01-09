package com.rish.client;

import com.rish.configuration.MyConfiguration;
import com.rish.model.Song;
import com.rish.service.SongService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        SongService service = context.getBean("songService", SongService.class);
        try {
            printAllSongs(service.getAllSongs());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        context.close();
    }

    private static void printAllSongs(List<Song> allSongs) {
        for(Song s : allSongs) {
            System.out.println(s);
        }
    }
}


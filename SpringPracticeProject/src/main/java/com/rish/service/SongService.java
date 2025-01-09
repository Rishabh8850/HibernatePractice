package com.rish.service;

import com.rish.Dao.SongDao;
import com.rish.model.Song;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

public class SongService {

    @Autowired
    public SongDao songDao;

    public boolean addSong() throws SQLException, ClassNotFoundException {
        return songDao.addSong();
    }

    public List<Song> getAllSongs() throws SQLException, ClassNotFoundException {
        return songDao.getAllSongs();
    }
}

package com.rish.Dao;

import com.rish.configuration.DBConfiguration;
import com.rish.model.Song;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SongDao {

    @Autowired
    public DBConfiguration dbConfiguration;

    public Statement st;

    public Connection connection;

    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        getStatement();
    }

    @PreDestroy
    public void destroy() throws SQLException {
        closeConnection();
    }

    public void closeConnection() throws SQLException {
        System.out.println("Connection closing");
        connection.close();
    }

    public void getStatement() throws SQLException, ClassNotFoundException {
        connection = dbConfiguration.getConnection();
        st = connection.createStatement();
    }

    public boolean addSong() throws SQLException, ClassNotFoundException {
        boolean rs = st.execute("Insert into hibernate_practice.song(SongId, songName, singerName) values(2,'Dope shope', 'Honey Singh')");
        return rs;
    }

    public List<Song> getAllSongs() throws SQLException, ClassNotFoundException {
        List<Song> songs = new ArrayList<>();
        Connection connection = dbConfiguration.getConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM hibernate_practice.song");
        while (rs.next()) {
            Song song = new Song();
            song.setSongId(rs.getInt(1));
            song.setSongName(rs.getNString(2));
            song.setSingerName(rs.getString(3));
            songs.add(song);
        }
        return songs;
    }
}

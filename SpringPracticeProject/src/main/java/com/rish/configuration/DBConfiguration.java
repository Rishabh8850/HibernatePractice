package com.rish.configuration;

import org.springframework.beans.factory.annotation.Value;

import java.sql.*;

public class DBConfiguration {

    @Value("${mysql.connection.driver}")
    private String driver;

    @Value("${mysql.connection.url}")
    private String url;

    @Value("${mysql.connection.password}")
    private String password;

    @Value("${mysql.connection.userName}")
    private String userName;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url,userName,password);
        return connection;
    }
}

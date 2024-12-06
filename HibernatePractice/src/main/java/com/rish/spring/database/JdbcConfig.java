package com.rish.spring.database;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {

    @Value("${mysql.driver}")
    private String driver;

    @Value("${mysql.url}")
    private String url;

    @Value("${mysql.userName}")
    private String userName;

    @Value("${mysql.password}")
    private String password;

    public void display() {
        System.out.println("Database connetion with driver : " + driver + " and url : " + url + " and username : " + userName + " and password : " + password);
    }

    public void jbdcConfiguration() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection established : "+ conn);
    }
}

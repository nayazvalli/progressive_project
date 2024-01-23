package com.wecp.progressive.config;

<<<<<<< HEAD
import java.sql.*;
import java.io.*;
import java.util.*;
public class DatabaseConnectionManager {
    private static final Properties properties = new Properties();
 
    static{
        loadProperties();
    }
 
    private static void loadProperties(){
        try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
            if(input == null){
                throw new IllegalStateException("resource.properties not found in classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }
 
    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring.datasource.url");
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
 
        return DriverManager.getConnection(url, user, password);
    }
=======
public class DatabaseConnectionManager {

>>>>>>> b0d4aae7d3e8f96795d0c3eb59a6d83be83ae77f
}

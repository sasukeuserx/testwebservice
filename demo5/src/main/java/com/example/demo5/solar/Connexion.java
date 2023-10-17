package com.example.demo5.solar;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    public static Connection getConn() throws Exception {
        String url = "jdbc:postgresql://containers-us-west-204.railway.app:6324/railway";
        String user = "postgres";
        String pass = "jX0bzVl6nupZ8nrTBVx6";
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
}

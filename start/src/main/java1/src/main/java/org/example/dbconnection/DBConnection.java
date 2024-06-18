package org.example.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection() throws SQLException {
        String url = "jdbc:h2:mem:Test"; //h2 database
        String user = "aa"; // Database username
        String password = "";  //Database password

        return DriverManager.getConnection(url, user, password);

    }
}

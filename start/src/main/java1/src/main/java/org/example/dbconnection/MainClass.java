package org.example.dbconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {

    public static void main(String args[]){
        DBConnection test = new DBConnection();

        try (Connection connection = test.getConnection()) {
            Statement statement = connection.createStatement();
            String createTableQuery = "CREATE TABLE If NOT EXISTS testdb ("
                    + "id INT PRIMARY KEY,"
                    + "NAME VARCHAR(255),"
                    + "TYPEOFEMPLOYEE VARCHAR(255),"
                    + "SALARY DECIMAL,"
                    + "ADDRESS VARCHAR(255))";
            statement.execute(createTableQuery);
            System.out.println("Table created succesfully,");
            String query = "INSERT INTO tstdb(id,NAME,TYPEOFEMPLOYEE,SALARY,ADDRESS)"
                    + "values('" + 12 + "','" + "Test" + "','" + "partTime" + "','" + 123 + "','" + "new"
                    + "')";
            statement.executeUpdate(query);
            String querySelect = "SELECT * from testdb where id = 13 ";
            ResultSet rs = statement.executeQuery(querySelect);
            if (rs.next()) {
                System.out.println("Name:" + rs.getString("name"));
            } else {
                System.out.println("No data found for id = 13");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I am testing");
    }
}
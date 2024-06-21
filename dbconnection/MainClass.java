package org.example.dbconnection;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




public class MainClass {



    public static void main(String args[]) {
        String Age;
        String rollno;
        String address;
        String name;

        DBConnection test = new DBConnection();
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the Student Age");
        Age = scanner.nextLine();
        student.AGE = Integer.parseInt(Age);
        System.out.println(Age);




//        System.out.println("Enter the Student Age");
//        rollno = scanner.nextLine();
//        student.ROLLNO = Integer.parseInt(Age);
//        System.out.println(Age);


//        System.out.println("Enter the Student address");
//        address = scanner.nextLine();
//        student.ADDRESS = String.valueOf(address);
//        System.out.println(address);


//        System.out.println("Enter the Student name");
//        name = scanner.nextLine();
//        student.NAME = String.valueOf(name);
//
//        System.out.println(name);


        try (Connection connection = test.getConnection()) {
            String createQuery="CREATE TABLE student ( age int, rollNumber int)";
            Statement statements=connection.createStatement();
            statements.execute(createQuery);
            String query="INSERT INTO student ( age, rollNumber)"
                    + "values('" + student.AGE + "','" + student.ROLLNO + "','" + "student.rollNumber"
                    + "')";

            statements.executeUpdate(query);
            System.out.println("Successfully connected to the H2 database.");

            String selectQuery="Select * from student";
            ResultSet result= statements.executeQuery(selectQuery);
            System.out.println(result.getRow());

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the H2 database..");
        }


    }}

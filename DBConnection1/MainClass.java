package org.example.DBConnection1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        DBConnection1 d=new DBConnection1();
        BusinessTeam bt=new BusinessTeam();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Name of the Worker");
       String worker=scanner.nextLine();
       bt.Name=worker;
        bt.printn();


        System.out.println("Enter the workerno");
        String workerno=scanner.nextLine();
        bt.WorkerNo=Integer.parseInt(workerno);
        bt.printw();


        System.out.println("Enter the Father Name of  Worker");
        String fathername=scanner.nextLine();
        bt.FatherName=fathername;
        bt.printfn();


        System.out.println("Enter Department of the  Worker");
        String department=scanner.nextLine();
        bt.Department=department;
        bt.printd();

        try (Connection connection = d.db1()) {
            String createQuery="CREATE TABLE WORKER (Name VARCHAR(50), WorkerNo int, FatherName VARCHAR(50))";
            Statement statements=connection.createStatement();
            statements.execute(createQuery);
            String query= STR."INSERT INTO WORKER (Name, WorkerNo, FatherName)values('\{bt.Name}','\{bt.WorkerNo}','\{bt.FatherName}')";

            statements.executeUpdate(query);
            System.out.println("Successfully connected to the H2 database.");

            String selectQuery="Select * from student";
            ResultSet result= statements.executeQuery(selectQuery);
            System.out.println(result.getRow());

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the H2 database..");
        }


    }
}

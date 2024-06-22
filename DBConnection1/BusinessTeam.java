package org.example.DBConnection1;

public class BusinessTeam {

    String Name;
    int WorkerNo;
    String FatherName;
    String Department;

    public void printn() {

        System.out.println("The Name of Worker is" + Name);
    }
    public void printw() {
        System.out.println("The worker no is " + WorkerNo);
    }
    public void printfn(){
        System.out.println("The father name is "+ FatherName);
    }
    public void printd(){

        System.out.println("The Department is"+ Department);

    }
}

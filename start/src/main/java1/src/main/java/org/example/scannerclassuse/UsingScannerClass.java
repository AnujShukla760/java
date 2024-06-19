package org.example.scannerclassuse;

public class UsingScannerClass{

    //we ll using the same inputs of the enumuse here

    int num;
    String day;
    public enum weekday {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}// very imp concept used to enumerate
    // the components that are facts i.e
    // there are seven days namely and to store in array

    public void switchstatement() {                       //switch case statements use

        switch (num) {

            case 1:
                System.out.println("the number is 1");
                break;
            case 2:
                System.out.println("the number is 2");
                break;

            case 3:
                System.out.println("the number is 3");
                break;

            default:
                System.out.println("not present");
        }
    }

    public void dayname(){

        switch(num){

            case 1:
                day="SUNDAY";
                System.out.println("Holiday");
                break;

            case 2:
                day="MONDAY";
                System.out.println("monday");
            case 3:
                day="TUESDAY";
                System.out.println("tuesday");

            default:
                System.out.println("invalid");

        }
        System.out.println(day);
    }


    }
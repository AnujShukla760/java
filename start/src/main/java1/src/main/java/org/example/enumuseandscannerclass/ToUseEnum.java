package org.example.enumuseandscannerclass;

import java.util.Scanner;

public class ToUseEnum {
   int num;
    String day;
   String dayname;

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

    public void dayname() {

        switch (num) {

            case 1:
                day = "SUNDAY";
                break;

            case 2:
                day = "MONDAY";
                break;

            case 3:
                day = "TUESDAY";
                break;

            default:
                System.out.println("invalid");
        }
        System.out.println(day);
    }

    public void enumweekday() {
        weekday[] sh = weekday.values();

        for (weekday day :sh){

            switch(day){

                case SUNDAY:
                  dayname=String.valueOf(day);
                    System.out.println(dayname);// assigning dayname the value of day in string

                  break;

                case MONDAY:
                    dayname=String.valueOf(day);
                    System.out.println(dayname);

                    break;

                case TUESDAY:
                    dayname=String.valueOf(day);
                    System.out.println(dayname);

                    break;

                default:
                    System.out.println("other day");

            }

        }
    }

    public  void main(String[] args) {
        ToUseEnum en=new ToUseEnum();
       // en.num=1;// here i will take input at run time i.e no hardcode

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number"); //scanner class is used to provide input at runtime
       String number=scanner.nextLine();
       en.num=Integer.parseInt(number);
        System.out.println("the no ;is " +  en.num);

         en.switchstatement();
      en.dayname();
      en.enumweekday();


    }
}














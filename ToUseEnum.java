package org.example.enumuse;
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

        for (weekday day : sh) {

            switch(day){

                case SUNDAY:
                  dayname=String.valueOf(day);  // assigning dayname the value of day in string

                  break;

                case MONDAY:
                    dayname=String.valueOf(day);

                    break;

                case TUESDAY:
                    dayname=String.valueOf(day);

                    break;

                default:
                    System.out.println("other day");

            }
            System.out.println(dayname);
        }
    }

    public static void main(String[] args) {
        ToUseEnum en=new ToUseEnum();
        en.num=2;
        en.switchstatement();
         en.dayname();
         en.enumweekday();
    }
}














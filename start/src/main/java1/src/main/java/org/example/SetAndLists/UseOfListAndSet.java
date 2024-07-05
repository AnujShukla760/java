//package org.example.SetAndLists;

import java.util.*;

//public class UseOfListAndSet {

//    @Override
//    public String toString() {
//        return "UseOfListAndSet{}";
//    }
//
//    public static void main(String[] args) {
//        Long Number;
//        String choice;
//        String sname;
//
//        StudentClass s = new StudentClass();
//        Set<Long> MobileNumber = new HashSet<>();
//        ListUse<String> StudentName = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Enter The Student mobileNumber ");
//            Number = scanner.nextLong();    //    See the Syntax for Set
//            MobileNumber.add(Number);
//            System.out.println("you wanna enter another number? (yes/no)");
//            choice = scanner.nextLine();    //to provide the input of choice directly at runtime
//        }
//
//        while (choice.equalsIgnoreCase("yes"));
//
//
//        do {
//            System.out.println("Enter the Student mobileNumber");
//            Number = scanner.nextLong();
//            MobileNumber.add(Number);
//            System.out.println("You wanna enter another number?  (yes/no)");
//            choice = scanner.nextLine();    //to provide the input of choice directly at runtime
//        }
//
//
//        while (choice.equalsIgnoreCase("yes"));
//
//
//        do {
//            System.out.println("Enter the Student mobileNumber");
//            Number = scanner.nextLong();
//            MobileNumber.add(Number);
//            System.out.println("You wanna enter another number?  (yes/no)");
//            choice = scanner.nextLine();    //to provide the input of choice directly at runtime
//
//        } while (choice.equalsIgnoreCase("no"));
//
//
//            System.out.println("The entered MobileNumbers are: " + MobileNumber);
//
//
//
//       do{     System.out.println("Enter The Name of the Student");
//        sname=scanner.nextLine();
//        StudentName.add(sname);
//        System.out.println("Do you wanna enter another name of Student (yes/no) ");
//  choice=scanner.nextLine();
//}
//
//
//       while (choice.equalsIgnoreCase("yes"));
//
//
//do{
//
//    System.out.println("Enter The Name of the Student");
//    sname=scanner.nextLine();
//    StudentName.add(sname);
//    System.out.println("Do you wanna enter another name of Student (yes/no) ");
//    choice=scanner.nextLine();
//
//}
//
//while(choice.equalsIgnoreCase("yes"));
//do{
//
//    System.out.println("Enter The Name of the Student");
//    sname=scanner.nextLine();
//    StudentName.add(sname);
//    System.out.println("Do you wanna enter another name of Student (yes/no) ");
//    choice=scanner.nextLine();
//}
//
//while (choice.equalsIgnoreCase("no"));
//        System.out.println("the names are: " + StudentName);
//
//s.setBranchName("CSE");
//s.setBusFacility(Boolean.parseBoolean("false"));
//s.setRollNo(Integer.parseInt("4"));
//s.setMobileNumber(MobileNumber);
//s.setStudentName(StudentName);
//        System.out.println(s);
//
//
//
//}}
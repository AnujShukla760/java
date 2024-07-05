package org.example.Exceptions;

import java.util.Scanner;

public class ExceptionHandling {

    public int n1;

    public int  n2;

    public int div;

    public void div(){

     div=  (n1/n2);
        System.out.println(div);
        }

    public static void main(String[] args) throws CustomArithmeticException {

        ExceptionHandling e = new ExceptionHandling();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of number1");
        String number1 = scanner.nextLine();
        e.n1 = (int) Double.parseDouble(number1);

        System.out.println("Enter the value of  number2");
        String number2 = scanner.nextLine();
        e.n2 = (int) Double.parseDouble(number2);
        e.div();

        e.n2 = (int) Double.parseDouble(number2);
        e.div();

        try {
            e.n2 = (int) Double.parseDouble(number2);
            e.div();
            if(e.div<5){
                throw new CustomArithmeticException("SELFMADE BAWA");
            }

        }
        catch(Exception f){
           f.printStackTrace();
       }
        throw new CustomArithmeticException("SELFMADE BAWA");  // parameterised constructor must be used

                //   [IT (throw) IS USED TO GIVE THE CUSTOM EXCEPTION]
    }}

              //NOTE---> Custom Exception hmesha thode exceptions ke liye use hoti h
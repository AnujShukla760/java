package org.example.statciandnonstatic;

public class staticandnonstatic {
  static  int number1;
   static int number2;

    public static void result() {
        System.out.println(number1);
        System.out.println(number2);
    }

    public static void main(String[] args) {      //when main is inside the class we need to make the variables and methods static
        result();// when main is inside the class and variables and methods are
                  //made static then we dont even  need class name and can directly call method

    }


}


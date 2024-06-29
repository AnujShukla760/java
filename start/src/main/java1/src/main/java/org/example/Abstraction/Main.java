package org.example.Abstraction;

public class Main {

    public static void main(String[] args) {

      //  Car car=new Car();  // We cant create the object of an Abstract class
       Car beamer=new Beamer() ; // we can create object of the child class(Beamer) and use properties of the parent
                                  // which is an abstract class(Car)
        beamer.wiper();   // accessing the non implemented abstract method
        beamer.brake();

        //(from this we can hide the details of the code that is what called as abstraction
        // now in this code the details of the non -implemented method that is the abstract
        // method are not directly accessible ,but it has to be accessed by the use of child class)


    }
}

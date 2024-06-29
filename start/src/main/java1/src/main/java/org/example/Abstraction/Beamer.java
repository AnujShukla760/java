package org.example.Abstraction;

public class Beamer extends Car {

    @Override
    public void wiper() {
        System.out.println("Implenting the Non Implementable method");

        //if this method is not implemented here then we cant inherit the Beamer class
        // from an abstract class i.e the Abstract class(Car)

    }
}

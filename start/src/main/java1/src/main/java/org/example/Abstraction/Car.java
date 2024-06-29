package org.example.Abstraction;

public abstract class Car {

    public void brake(){
        System.out.println("This is the Implemented Method");
        // IMPLEMENTED METHOD(which contains the definition and is accessible by creating the object of class)
    }

    public abstract void wiper();
   //(This is the abstract method which does not contain any definitions and is also called as the
    //    NON -IMPLEMENTED METHOD) It is also not accessible by creating object of this class.
}

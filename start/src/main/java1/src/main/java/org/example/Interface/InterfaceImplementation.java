package org.example.Interface;

public class InterfaceImplementation implements UseOfInterface{
  public int sum;
  public int mul;
  public int div;

    @Override
    public void sum() {                        // we re implementing the non -implemented methods in this class.
   sum=num+num1;
        System.out.println(sum);
    }

    @Override
    public void mul() {         // we re implementing the non -implemented methods in this class.
        mul=num*num1;
        System.out.println(mul);
    }

    @Override
    public void div() {       // we re implementing the non -implemented methods in this class.
        div=num/num1;
        System.out.println(div);
    }

    public static void main(String[] args) {
        UseOfInterface i=new InterfaceImplementation();
        i.sum();          // now only we can call these methods
        i.mul();
        i.div();
    }
}

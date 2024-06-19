package org.example.startofcode;

import org.example.operators.Operators;
import org.example.staticpackage.Anujstatic;

public class SumOfNumbers {
     int n1;// n1 will store in data segment memory
     int  n2;

     int sum;// sum is stored in metaspace(static)
   double mul;
   float div;
    public  void sum() {
        sum = n1 + n2;
        System.out.println(sum);
    }

    public  void mul(){
        mul=n1*n2;
        System.out.println(mul);

    }
public  void div(){
        div=n1/n2;
    System.out.println(div);
}

    public static void main(String[] args) {

        SumOfNumbers anuj=new SumOfNumbers();//"anuj" will be stored in heap
        anuj.n1 = 20;
        anuj.n2 = 13;
        anuj.sum();
        anuj.mul();
        anuj.div();


      Cars f=new Cars();
    f.name="maruti";
    f.model=123;
    f.regno=3456;
    f.modelinfo();







    }
}





























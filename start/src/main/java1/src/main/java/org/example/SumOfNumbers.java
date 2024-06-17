package org.example;
public class SumOfNumbers {
    int n1;// n1 will store in data segment memory
    int n2;

   static int sum;// sum is stored in metaspace(static)
    public void sum(){
        sum=n1+n2;
    }

   public static void main(String[] args) {

       Anuj anuj=new Anuj();//"anuj" will be stored in heap
       anuj.n1=20;
       anuj.n2=13;
       anuj.sum();

       Anujstatic.n1=23;
       Anujstatic.n2=24;
       Anujstatic.sum();

       Anuj3 yes1=new Anuj3();
       yes1.n1=12;
       yes1.n2=14;
       yes1.mul();



    }










        }




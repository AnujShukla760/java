package org.example.Polymorphismconcept.Overloading;

public class Overloading {



 public void sum( int a, int b){

 int sum=a+b;
     System.out.println(sum);

 }

 public void sum(double a,double b){

   double sum=a+b;
     System.out.println(sum);
 }

  public void sum(int a,int b, int c){
    int  sum=a+b+c;
      System.out.println(sum);
  }
    public void sum(double a,double b,double c){
     double sum=a+b+c;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.sum(2,4);
        o.sum(0.4,3.4);   //same SUM method is used with different datatypes of different number
                               // of arguments
        o.sum(2,3,4);

        //(IT CAN BE IMPLEMENTED IN A SINGLE CLASS)

    }

}

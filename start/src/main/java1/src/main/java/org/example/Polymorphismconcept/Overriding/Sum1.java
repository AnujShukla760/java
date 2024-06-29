package org.example.Polymorphismconcept.Overriding;

public class Sum1 extends Sum{
int sum;



@Override

    public void sum(int a, int b){  // the method as "sum" is overrides here to provide different function
                                    // with the same name.
         sum=a+b/2;
         System.out.println(sum);   // here the method name is same but function is different i.e a+b/2

    }

}

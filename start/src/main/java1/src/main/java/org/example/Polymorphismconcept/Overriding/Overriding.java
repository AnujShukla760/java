package org.example.Polymorphismconcept.Overriding;

public class Overriding {


    public static void main(String[] args) {
   Sum1 s=new Sum1();    /// this feature provides us the flexibility to use same method name with different
   s.sum(2,3);  // functionality . and jiska object hoga uske wala method chlega

        Sum ss=new Sum();
        ss.sum(4,5);  // executes the sum method in Sum class

        //(DIFFERENT CLASSES ARE NEEDED TO IMPLEMENT OVERRIDING AND INHERITANCE IS ALSO USED IN THIS)
    }



}

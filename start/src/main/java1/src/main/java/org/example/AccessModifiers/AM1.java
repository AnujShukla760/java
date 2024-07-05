package org.example.AccessModifiers;

public class AM1 {
    public static void main(String[] args) {
        AM m=new AM();
        m.name="Anuj";
      //  m.age=12;     // we cant access "age" out of its class in which it is declared
                     // to access it we need (getter and setter) methods (IT WILL GENERATE ERROR)
                         // (uncomment it to see real implementation )
        m.setAge(21);  //by using getter and setter we are able to access "age" out of its class
        m.shown();

        ProtectedAM p=new ProtectedAM();
        p.num=1;   // i  can access it out of the class as well but we cant access it out of the package
                  // i.e ("AccessModifiers")

        p.num1=12;
        p.sum();




    }
}

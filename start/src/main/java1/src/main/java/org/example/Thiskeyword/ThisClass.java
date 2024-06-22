package org.example.Thiskeyword;

import com.mysql.cj.xdevapi.AddResult;

public class ThisClass {

    int Age;

    String Name;

    String Address;

    int RollNo;

    public void thisclass() {//  un parametrised method

        System.out.println("the age is" + Age);
        System.out.println("the name is " + Name);
        System.out.println("the RollNo. is " + RollNo);

    }

    public  ThisClass(int Age, String Name,int RollNo ) { // parameterised method (constructor)
        this.RollNo = RollNo;
        this.Age = Age;
        this.Name = Name; }




}



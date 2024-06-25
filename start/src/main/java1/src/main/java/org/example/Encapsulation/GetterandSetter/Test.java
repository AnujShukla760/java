package org.example.Encapsulation.GetterandSetter;

public class Test {
    public static void main(String[] args) {

        GetterAndSetter gs = new GetterAndSetter();
       gs.setAge(21);
       gs.setAddress("VPO KHAGGAL");
       gs.setBranch("CSE");
       gs.setName("ANUJ"); //"name" is private but it can be called out of class via getter and setter
       //gs.name="anuj";  //"name" is private and cant be accessed out of class without the use of getter and setter
     // code will show error in "name" and will not run without getter and setter

        gs.present();
    }
}
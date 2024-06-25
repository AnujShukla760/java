package org.example.AccessModifiers;

public class AM {
    private int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



public void shown(){
    System.out.println(name);
    System.out.println(age);
}

    public static void main(String[] args) {
        AM n=new AM();
        n.age=21;     // "age" cant be accessed in any other class bcz its AM type is private but right now
        n.name="Anuj"; // it is accessed bcz it is in the same class


    }
}

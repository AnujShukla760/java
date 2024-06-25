package org.example.Encapsulation.GetterandSetter;

public class GetterAndSetter {

    private int age;

    private String name;

    private String address;

    private String branch;


    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;                                 //if getter and setter not created then "name" cant be accessed
                                                       // out of this class as we have done in "Test" class.
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void present () {

            System.out.println(age);
            System.out.println(address);
            System.out.println(branch);
            System.out.println(name);
        }

    }






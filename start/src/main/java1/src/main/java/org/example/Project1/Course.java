package org.example.Project1;

public class Course {

    private String branch;

    private String courseName;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
public void show(){

    System.out.println("The Branch Of The Student is  "+branch);
    System.out.println("The Enrolled Course is  "+courseName);
}
  }
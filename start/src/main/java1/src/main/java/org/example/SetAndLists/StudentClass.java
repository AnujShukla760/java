package org.example.SetAndLists;

import java.util.List;
import java.util.Set;

public class StudentClass {


    private int rollNo;

    private String branchName;

    private boolean busFacility;


    public List<String> getMobileNumber() {
        return mobileNumber;
    }
    
    public Set<Long> getStudentName() {
        return studentName;
    }

 
    

    private List<String> mobileNumber;
      private Set<Long> studentName;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public boolean isBusFacility() {
        return busFacility;
    }

    public void setBusFacility(boolean busFacility) {
        this.busFacility = busFacility;
    }


    public void setStudentName(List<String> studentName) {
    }

    public void setMobileNumber(Set<Long> mobileNumber) {
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "rollNo=" + rollNo +
                ", branchName='" + branchName + '\'' +
                ", busFacility=" + busFacility +
                ", mobileNumber=" + mobileNumber +
                ", studentName=" + studentName +
                '}';
    }
}

package org.example.Project1;

public class Address {

    private int pinCode;
    private String dist;
    private String state;


    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

   public void showadd(){
       System.out.println("The Pincode Of the Student Area is " +pinCode);
       System.out.println("The Distict Of Student Is "+dist);
       System.out.println("Name Of The State is "+ state);

   }

}

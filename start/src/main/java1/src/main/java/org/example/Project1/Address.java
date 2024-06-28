package org.example.Project1;

public class Address{

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    private String state;
   private String district;
   private int pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}

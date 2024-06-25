package org.example.Project1;

public class Identification {


    private int adharno;
    private int passportNo;
    private int dlNo;

    public int getAdharno() {
        return adharno;
    }

    public void setAdharno(int adharno) {
        this.adharno = adharno;
    }

    public int getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(int passportNo) {
        this.passportNo = passportNo;
    }

    public int getDlNo() {
        return dlNo;
    }

    public void setDlNo(int dlNo) {
        this.dlNo = dlNo;
    }
    public void showid(){
        System.out.println("The Aadhar No is "+adharno);
        System.out.println("The Passport No is "+passportNo);
        System.out.println("The Dl NO is "+dlNo);
    }
}

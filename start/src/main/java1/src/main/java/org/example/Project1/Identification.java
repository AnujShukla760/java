package org.example.Project1;

public class Identification {
    public String getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }

    public String getIdentificationValidity() {
        return identificationValidity;
    }

    public void setIdentificationValidity(String identificationValidity) {
        this.identificationValidity = identificationValidity;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public void setPanCardNo(String panCardNo) {
        this.panCardNo = panCardNo;
    }

    public String getDlNo() {
        return dlNo;
    }

    public void setDlNo(String dlNo) {
        this.dlNo = dlNo;
    }

    private String adharNo;
    private String identificationValidity;
    private String panCardNo;
    private String dlNo;

    @Override
    public String toString() {
        return "Identification{" +
                "adharNo='" + adharNo + '\'' +
                ", identificationValidity='" + identificationValidity + '\'' +
                ", panCardNo='" + panCardNo + '\'' +
                ", dlNo='" + dlNo + '\'' +
                '}';
    }
}

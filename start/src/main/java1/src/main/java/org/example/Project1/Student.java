package org.example.Project1;

public class Student {

    private String name;

    private String rollNumber;
    private String stream;                   //new concept it is a class not a variable
                                               //we can list other variables in "course" class as well


    private boolean hostelFacility;          //boolean---> true/false

    private boolean busFacility;

    private Identification identification;  //||ly we can add various variables to identification as well
                                              //as we did in "course" class

    private Address address;                   //similarly for "address" class as well

    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }



    public int getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    private int libraryCard;

    public boolean isHostelFacility() {
        return hostelFacility;
    }

    public void setHostelFacility(boolean hostelFacility) {
        this.hostelFacility = hostelFacility;
    }

    public boolean isBusFacility() {
        return busFacility;
    }

    public void setBusFacility(boolean busFacility) {
        this.busFacility = busFacility;
    }
    public void result(){
        System.out.println("The Name Of Student Is "  +   name);
        System.out.println("The Stream Of the Student Is "   +     stream);
        System.out.println("The Student Has Hostel AS "+ hostelFacility);
        System.out.println("The Student Has Bus As "+ busFacility);

    }

    public static void main(String[] args) {
        Student s=new Student();
        Identification i=new Identification();  //to access the identification class variables
        Address A=new Address();

        s.setBusFacility(true);
        s.setName("Anuj");
        s.setHostelFacility(true);
        s.stream="cse";
        s.result();
        i.setAdharno(9710);
        i.setPassportNo(1234);
        i.setDlNo(225373);
        i.showid();
        A.setDist("HAMIRPUR");
        A.setPinCode(177001);
        A.setState("HIMACHAL");
        A.showadd();




    }





}

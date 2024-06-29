package org.example.Project1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Course getStream() {
        return stream;
    }

    public void setStream(Course stream) {
        this.stream = stream;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

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

    private String name;
    private String rollNo;
    private Course stream;
    private Identification identification;
    private Address address;
    private Gender gender;
    private int libraryCard;
    private boolean hostelFacility;
    private boolean busFacility;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", stream=" + stream +
                ", identification=" + identification +
                ", address=" + address +
                ", gender=" + gender +
                ", libraryCard=" + libraryCard +
                ", hostelFacility=" + hostelFacility +
                ", busFacility=" + busFacility +
                '}';
    }

    public static void main(String[] args) {
        Student s = new Student();
        Course c = new Course();
       Gender g = new Gender();
        Address a = new Address();
        Identification i = new Identification();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name Of Student");
        String Name = scanner.nextLine();
        s.setName(Name);

        System.out.println("Enter The RollNo Of Student");
        String RollNo = scanner.nextLine();
        s.setRollNo(RollNo);


        System.out.println("Enter The Branch of the Student");
        String Branch = scanner.nextLine();
        c.setBranch(Branch);


        System.out.println("Enter The Session of the Course");
        String Session = scanner.nextLine();
        c.setSession(Session);
        s.setStream(c);

        System.out.println("Enter The AadharNo of the Student");
        String AadharNo = scanner.nextLine();
        i.setAdharNo(AadharNo);
        System.out.println("Enter The PancardNo of the Student");
        String PancardNo = scanner.nextLine();
        i.setPanCardNo(PancardNo);
        System.out.println("Enter the Identifiaction validity");
        String Identification = scanner.nextLine();
        i.setIdentificationValidity(Identification);

        s.setIdentification(i);
//        System.out.println("Enter The Gender of the Student");
//        String Gender = scanner.nextLine();

        System.out.println("IS there hostel facility?");
        String hostel = scanner.nextLine();
        s.setHostelFacility(Boolean.parseBoolean(hostel));

        System.out.println("is there bus facility");
        String bus = scanner.nextLine();
        s.setBusFacility(Boolean.parseBoolean(bus));

        System.out.println("Enter the pincode of the Student Address");
        String pincode=scanner.nextLine();
        a.setPinCode(Integer.parseInt(pincode));

        System.out.println("Enter the Districtt in Which student Lives");
        String Districtt=scanner.nextLine();
        a.setDistrict(Districtt);

//        System.out.println("Enter the Gender of the Student");
//        String gender=scanner.nextLine();
//        Gender gg= Gender.valueOf(gender);
//        System.out.println(gg);
//        s.setGender(gg);


        s.setAddress(a);
        System.out.println(s);



    }}
package org.example.staticpackage;

public class Anujstatic {
    static int n1;     //metaspace storage allocated
    static int n2;
    static int sum;

    public static void sum() {
        sum = n1 + n2;
        System.out.println(sum);
    }

    public static void main(String[] args) {


        Anujstatic.n1 = 3;
        Anujstatic.n2 = 1;
        Anujstatic.sum();
    }
}





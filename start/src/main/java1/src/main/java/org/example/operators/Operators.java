package org.example.operators;

import org.example.startofcode.SumOfNumbers;
import org.example.staticpackage.Anujstatic;

public class Operators {

    int m1;
    int m2;                         //  LOGICAL OPERATORS("&&" and "||")
    int sum;

    public void add(int n1, int n2) {
        sum = m1 + m2;

        if (sum < 10 && sum > 4) {


            System.out.println("condition satisfied that is the logical and worked"   + sum);
        } else if (sum > 10 || sum > 12) {


            System.out.println("ome of the statement worked "      + sum);
        } else if(sum==10){
            System.out.println("i got a 10 and 5");
        }else if (sum!=15){
            System.out.println("i didnt get 10 and 5");
            System.out.println(sum);

        }
            else{
            System.out.println("no need to use any operator");
        }
    }

public static void main(String[] args) {
        Operators s=new Operators();
        s.add(10,0);





}


}
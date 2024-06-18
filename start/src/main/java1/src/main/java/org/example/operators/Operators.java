package org.example.operators;

public class Operators {

    int n1;
    int n2;                         //  LOGICAL OPERATORS("&&" and "||")
    int sum;

    public void add(int n1, int n2) {
        sum = n1 + n2;

        if (sum < 10 && sum > 4) {


            System.out.println("condition satisfied that is the logical and worked"   + sum);
        } else if (sum > 10 || sum > 12) {


            System.out.println("ome of the statement worked "      + sum);
        } else if(sum==10){
            System.out.println("i got a 10 and 5");
        }else if (sum!=15){
            System.out.println("i didnt get 10 and 5");

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
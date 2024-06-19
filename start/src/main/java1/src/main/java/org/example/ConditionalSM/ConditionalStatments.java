
package org.example.ConditionalSM;
public class ConditionalStatments {

    int n1;

    public void switchstatement() {                       //switch case statements use

        switch (n1) {

            case 1:
                System.out.println("the number is 1");
                break;
            case 2:
                System.out.println("the number is 2");
                break;

            case 3:
                System.out.println("the number is 3");
                break;

            default:
                System.out.println("not present");
        }
    }


    public void main() {
        ConditionalStatments cs = new ConditionalStatments();
        cs.n1=2;
        cs.switchstatement();


    }
}
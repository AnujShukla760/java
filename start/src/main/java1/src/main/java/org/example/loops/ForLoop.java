package org.example.loops;

public  class ForLoop {
   int i;

    public void forloop() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        ForLoop f=new ForLoop();// for loop use
        f.forloop();

     YWhilLoop w=new YWhilLoop(); //// while loop implementation via its class obect
     w.use(); //while loop method call




    }

    }
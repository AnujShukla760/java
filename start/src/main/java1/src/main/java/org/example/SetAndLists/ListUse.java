package org.example.SetAndLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ListUse {

    public static void main(String[] args) {

        List<String> Perfumes = new ArrayList<>();
        Perfumes.add("dior Sauvauge");
        Perfumes.add("rasasi hawas");
        Perfumes.add("Wildstone Edge");
        Perfumes.add("Denver Hamilton");

        Iterator<String> itr = Perfumes.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }


    }
}

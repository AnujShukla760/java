package org.example.SetAndLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUse {
    public static void main(String[] args) {


            Set<String> Perfumess = new HashSet<>();
            Perfumess.add("dior Sauvauge");
            Perfumess.add("rasasi hawas");
            Perfumess.add("Wildstone Edge");
            Perfumess.add("Denver Hamilton");
           Perfumess.add("rasasi hawas");     // it will be printed only once because set dont allow
                                               // duplicate values
            Iterator<String> itr = Perfumess.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());

    }
}}

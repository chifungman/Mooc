package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {


    public static void removeLast(ArrayList<String> list) {
        int number = list.size();
        list.remove(number-1);
    }



    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String> ();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);
        
        Collections.sort(brothers);

        removeLast(brothers);

        System.out.println(brothers);


    }
}

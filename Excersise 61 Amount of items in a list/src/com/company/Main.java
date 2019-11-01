package com.company;

import java.util.ArrayList;

public class Main {

    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ciao");
        list.add("Hello");
        list.add("Hallo");
        System.out.println("There are this many items on the list: ");
        System.out.println(countItems(list));
    }
}

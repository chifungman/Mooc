package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner readers = new Scanner(System.in);



        ArrayList<String> words = new ArrayList<String>();
        String word = "";



        while (true) {
            System.out.println("Type in a word");
            word = readers.nextLine();
            words.add(word);
            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                System.out.println(words);




        }


        }








    }
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> words = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        String typedWord;

        while (true) {
            System.out.println("Type a word");
            typedWord = reader.nextLine();
            words.add(typedWord);
            if (typedWord.isEmpty()) {
                break;
            }
        }
        Collections.sort(words);
        for ( String word : words) {
            System.out.println(word);
        }

    }
}

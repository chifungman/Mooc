package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList <String> words = new ArrayList<>();
        String typedWord;

        while (true) {
            System.out.println("Type a word: ");
            typedWord = reader.nextLine();
            words.add(typedWord);


            if (typedWord.isEmpty()) {
                break;
            }
            for (String word :words) {


            }
        }
        for (String word : words) {
            System.out.println(word);

        }

    }
}

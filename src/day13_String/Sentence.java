package day13_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();

        scan.close();
        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);
        sentence = ""+first+last;

        System.out.println(sentence);


        scan.close();

    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */

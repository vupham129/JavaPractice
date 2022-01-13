package day14_String;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.next();
        String word2 = scan.next();

        word1 = word1.substring(1);
        word2 = word2.substring(1);

        System.out.println(word1+word2);

        scan.close();



    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
package day13_String;

import java.util.Scanner;

public class FirstAndLastCharSame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();

        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length() -1);

        if(first == last){
            System.out.println("same");

        }else{
            System.out.println("not same");
        }

        scan.close();
    }
}
/*
1. write a program that can check if the first and last characters of the
 string are same
            ex:
                level
            output:
                same
 */
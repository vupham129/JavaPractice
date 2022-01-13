package day15_ForLoop;


import java.util.Scanner;

public class DigitsLettersSpecialCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.next();
        String letters = "", digits = "", special = "";


        for (int i = 0; i <sentence.length(); i++) { // 0= i < length of sentence (int value)
            if((sentence.charAt(i)>='A'&& sentence.charAt(i)<='Z')||(sentence.charAt(i)>='a'&& sentence.charAt(i)<='z')){
                letters += sentence.charAt(i);
            } else if (sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9') {
                digits += sentence.charAt(i);
            }else{
                special += sentence.charAt(i);
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);





    }
}
/*
 5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
package day13_String;

import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        int totalStr = str.length();
        String result = "";
        if(totalStr==0){
            result = "empty";
        }else if(totalStr<=3){
            result = str;
        }else{
            char last1Chars = str.charAt(str.length() - 1);
            char last2Chars = str.charAt(str.length() -2);
            char last3Chars = str.charAt(str.length()-3);
            result = "" +last3Chars +last2Chars+last1Chars;
        }
        System.out.println(result);

        scan.close();

    }
}
/*
3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
package day13_String;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str = scan.nextLine();
        String str1 = scan.nextLine();

         int totalStr = str.length();
         int totalStr1 = str1.length();

         if(totalStr>totalStr1){
             System.out.println(str);
         }else{
             System.out.println(str1);
         }

         scan.close();


    }
}
/*
2. write a program that asks user to enter two strings,
and print out the longest string
 */
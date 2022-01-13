package day19_LoopPractices;

import java.util.Scanner;

public class FirstDuplicatedChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scan.next();

        String result = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    result = result + str.charAt(i);
                    count++;
                }
            }

            if (count==2){
                break;
            }


        }

        System.out.println(result);

scan.close();








    }
}
/*
1. Write a program that can return the first duplicated character from a string
 */
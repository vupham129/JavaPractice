package day15_ForLoop;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String w = sc.next();

        sc.close();
        String r = "";

        for(int i = w.length()-1; i>=0; i--){
            r += w.charAt(i);
        }
        if(w.equalsIgnoreCase(r)){
            System.out.println("true");
        }


    }
}
/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */
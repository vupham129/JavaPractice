package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = scan.nextLine(); // Wooden Spoon

        scan.close();
        String reverse = "";
        for(int i = s.length()-1; i >= 0; i--){
            reverse = reverse + s.charAt(i);// i = 12 -> 'n', i = 11 -> 'o'....i= 0->'W'
        }
        System.out.println("reverse = " + reverse);



    }
}
/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */
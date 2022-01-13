package day15_ForLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = scan.next();

        scan.close();
        int totalChar = 0;
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                totalChar += s.charAt(i) -48;
            }
        }

        System.out.println(totalChar);



    }
}
/*
  6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */
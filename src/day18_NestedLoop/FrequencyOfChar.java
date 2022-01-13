package day18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string of characters");
        String str = scan.next();

        for (char j = 'a'; j <= 'z'; j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(j==str.charAt(i)){
                        count++;
                }
            }

            if(count!=0) {
                System.out.print(""+j + count);
            }

        }

        scan.close();

    }
}
/*

4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
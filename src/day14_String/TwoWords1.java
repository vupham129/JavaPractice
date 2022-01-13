package day14_String;

import java.util.Scanner;

public class TwoWords1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.next();
        String word2 = scan.next();


        char last = word1.charAt(word1.length()-1);
        char first =word2.charAt(0);

        if(last == first) {
            String totalWord1 = word1 + word2.substring(1);
            System.out.println(totalWord1);
        }

        scan.close();

    }
}
/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
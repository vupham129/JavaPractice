package day18_NestedLoop;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string of characters");
        String str = scan.next();

        for(char j = 'a'; j<='z';j++){ // j = a, b, c, d ...z
            int count = 0;
            for (int i = 0; i < str.length(); i++) { // i = 0,1,2,3....
                if (j == str.charAt(i)){// j =a, charAt(i =(0)) = a ==> j = charAt(i)
                    count++;
                }
            }
            if(count==1){
                System.out.print(""+j);
            }

        }
        scan.close();



    }
}
/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */
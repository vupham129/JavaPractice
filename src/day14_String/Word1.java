package day14_String;

import java.util.Scanner;

public class Word1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String result = "";
        if(word.indexOf('x') == 0){
            result = word.substring(1);
        }
        System.out.println(result);


        scan.close();



    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
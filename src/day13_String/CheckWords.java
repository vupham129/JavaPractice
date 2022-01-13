package day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 words:");
        String word = scan.nextLine();
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        int totalWord = word.length();
        int totalWord1 = word1.length();
        int totalWord2 = word2.length();

        String result = "";

        if(totalWord==totalWord1&&totalWord==totalWord2){
            result = "All words are same length";
        }else if(totalWord == totalWord1 && totalWord != totalWord2 && totalWord1 != totalWord2||
                 totalWord1 == totalWord2 && totalWord != totalWord1 ){
            result = "Not Same nor Different lengths";
        }else{
            result = "All different length";
        }

        System.out.println(result);

        scan.close();

    }
}
/*
5. Write a program  for CheckWords, the program accepts 3 words and :
    - if they are same length:  print "All words are same length"
    - if some same length and others not:    print "Not Same nor Different lengths"
    - if all different length :  print "All different length"
 */

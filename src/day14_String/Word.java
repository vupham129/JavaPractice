package day14_String;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String word1 = word.substring(word.length()-2);

        if(word1.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

        scan.close();

    }
}
/*
 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */
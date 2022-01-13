package day19_LoopPractices;

import java.util.Scanner;

public class CharacterAppearTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scan.next();

        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count==2){
                result = result + str.charAt(j);
            }

        }

        System.out.println(result);


    }
}

/*
3. Write a program that can display all the characters that appeared twice in the string.
 */
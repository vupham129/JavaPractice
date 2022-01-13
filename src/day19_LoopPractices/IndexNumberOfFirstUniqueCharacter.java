package day19_LoopPractices;

import java.util.Scanner;

public class IndexNumberOfFirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scan.next();

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    result = str.indexOf(str.charAt(j));
                    count++;

                }
            }
            if(count==1){
               break;
            }


        }

        System.out.println(result);
scan.close();

    }
}
/*
4. Write a program that can return the index number of the first unique character.
 */
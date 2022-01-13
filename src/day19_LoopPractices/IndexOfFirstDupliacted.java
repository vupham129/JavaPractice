package day19_LoopPractices;

import java.util.Scanner;

public class IndexOfFirstDupliacted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scan.next();

        int result = 0;

        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(j)== str.charAt(i)){
                    result = str.indexOf(str.charAt(i));
                    count++;
                }
            }
            if(count ==2){
                break;
            }


        }
        System.out.println(result);

scan.close();


    }
}
/*
 2. Write a program that cna return the index number of the first duplicated character from a string
 */
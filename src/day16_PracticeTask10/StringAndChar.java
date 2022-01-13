package day16_PracticeTask10;

import java.util.Scanner;

public class StringAndChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter a character");
        String ch = sc.next();

        sc.close();

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(ch.charAt(0)== str.charAt(i)){
                count++ ;
            }
        }

        System.out.println(count);







    }
}

/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
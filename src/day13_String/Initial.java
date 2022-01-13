package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String str = scan.next();
        System.out.println("Enter your second word");
        String str1 = scan.next();

        char firstofStr = str.charAt(0);
        char firstofStr1 = str1.charAt(0);

        String result = firstofStr + "." + firstofStr1;

        System.out.println(result);
        scan.close();

    }
}
/*
2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */
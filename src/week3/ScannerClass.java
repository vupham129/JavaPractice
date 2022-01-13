package week3;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // shortcut scanner

        //1. ask the user to enter an integer number
        System.out.println("Enter an integer number:");
        int num1 = input.nextInt();

        //2. ask the user to enter a decimal number
        System.out.println("Enter a decimal number:");
        double num2 = input.nextDouble();

        //3. ask user to enter a word
        System.out.println("Enter a word:");
        String str = input.next();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("str = " + str);

    }
}
/*
provides the methods to get inputs
presented in java.util package
need to be imported in our program
    import java.util.Scanner;
    (keyword)(package)(class)
 scanner creation/ declaration
 Scanner keyboard = new Scanner(System.in);
 nextInt() --> returns input as an int
 nextDouble() --> as a double
 nextBoolean() --> as a boolean
 next() --> as a string, reads the input only until a space
 nextLine()--> as a string, read the entire input until the new line( press Enter)
 */
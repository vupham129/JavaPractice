package day17_While_DoWhile;

import java.util.Scanner;

public class DivideTwoPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();

        int division = 0;
        while(!(num1>0 && num2>0)){
            System.err.println("Your number is negative, please re-enter");
            System.err.println("Enter number 1:");
            num1 = scan.nextInt();
            System.err.println("Enter number 2:");
            num2 = scan.nextInt();
        }
        while(num1-num2>=0){
            division++;
            num1 -= num2;
        }

        System.out.println(division);





    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

 */
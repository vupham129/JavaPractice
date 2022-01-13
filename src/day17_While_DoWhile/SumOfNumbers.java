package day17_While_DoWhile;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers = 0;

        int sumOfNumbers = 0;
        while(numbers>=0){
            System.err.println("Please enter numbers");
            numbers = scan.nextInt();
            if(numbers>0) {
              sumOfNumbers += numbers;
            }else{
                break;
            }
        }

        System.out.println(sumOfNumbers);

    }
}
/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */
package day16_PracticeTask10;

import java.util.Scanner;

public class TwoPosNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiply = 0;
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1<0 || num2<0){
            System.out.println("Invalid");
        }else{
            for(int i = 0; i < num2; i++){
                multiply += num1;
            }
        }

        System.out.println(multiply);

        sc.close();

    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */
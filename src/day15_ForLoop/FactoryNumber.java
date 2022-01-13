package day15_ForLoop;

import java.util.Scanner;

public class FactoryNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        int factoryNum = 1; // can not = 0 because 0*num = 0, factoryNum >=1
        for (int i = 1; i <= num  ; i++) {
            factoryNum *= i;
        }
        System.out.println(factoryNum);

        scan.close();


    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
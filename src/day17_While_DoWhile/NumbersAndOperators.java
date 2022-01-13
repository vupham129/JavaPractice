package day17_While_DoWhile;

import java.util.Scanner;

public class NumbersAndOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        double num1 = scan.nextDouble();
        System.out.println("Enter number 2:");
        double num2 = scan.nextDouble();
        System.out.println("Enter math operator");
        char mathOperator = scan.next().charAt(0);

        double result = 0;

        while(!(mathOperator == '+' ||mathOperator == '-'||mathOperator == '*' || mathOperator=='/')) {
            System.err.println("Invalid operator, please re-enter");
            System.err.println("Enter math operator");
            mathOperator = scan.next().charAt(0);
        }
            switch (mathOperator) {
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
        System.out.println(result);





    }
}
/*
 3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */
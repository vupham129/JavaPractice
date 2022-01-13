package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        while(true){
            System.out.println("Enter the first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter math operator:");
            String mathOperator = scan.next();
            while(!(mathOperator.equals("+")||mathOperator.equals("-")||mathOperator.equals("*")||mathOperator.equals("/") )){
                System.err.println("Invalid math operator, please re-enter");
                mathOperator = scan.next();
            }
            System.out.println("Enter the second number:");
            int num2 = scan.nextInt();

            if(mathOperator.equals("+")){
                result = num1+num2;
            }else if(mathOperator.equals("-")){
                result = num1 - num2;
            }else if(mathOperator.equals("*")){
                result = num1*num2;
            }else{
                result = num1 / num2;
            }
            System.out.println("result = " + result);

            System.out.println("Do you want to continue?");
            String a = scan.next().toLowerCase();
            while(!(a.equals("yes")||a.equals("no"))){
                System.err.println("Invalid answer, please re-enter your answer");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }






        }





        scan.close();




    }
}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */
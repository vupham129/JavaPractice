package day17_While_DoWhile;


import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine().toLowerCase();

        System.out.println("Enter your gender");
        String gender = scan.next().toLowerCase();
        while (!(gender.equals("female") || gender.equals("male"))) {
            System.err.println("Invalid entry, please reenter your gender");
            gender = scan.next().toLowerCase();
        }

        System.out.println("Are your married? yes/no");
        String married = scan.next().toLowerCase();
        while (!(married.equals("yes") || married.equals("no"))) {
            System.err.println("Invalid entry, please re-enter your answer marriage question");
            married = scan.next().toLowerCase();
        }

        System.out.println("Enter your age:");
        int age = scan.nextInt();
        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid age, please re-enter your age");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int miles = scan.nextInt();
        while (!(miles >= 0 && miles <= 5)) {
            System.err.println("Invalid miles, please re-enter miles");
            miles = scan.nextInt();
        }

        scan.nextLine();
        System.out.println("Do you want full coverage or liability insurance?");
        String plan = scan.nextLine().toLowerCase();
        while(!(plan.equals("full coverage")||plan.equals("liability"))){
            System.err.println("Invalid entry, please re-enter");
            plan = scan.nextLine().toLowerCase();
        }

        System.out.println("Did you have any accidents or claims in past 5 years? yes/no");
        String accident = scan.next().toLowerCase();
        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.err.println("Invalid answer, please answer again");
            accident = scan.next().toLowerCase();
        }

        System.out.println("Did your car have an anti-theft device? yes/no");
        String antiTheftDevice = scan.next().toLowerCase();
        while (!(antiTheftDevice.equals("yes") || antiTheftDevice.equals("no"))) {
            System.err.println("Invalid answer, please answer again");
            antiTheftDevice = scan.next().toLowerCase();
        }
        int agePrices = 0;
        int milesPrice = 0;

       if(plan.equals("liability")){
           agePrices = (age<25)? 90:50;
           milesPrice = (miles<=10)? 10:(miles>10&&miles<=50)? 30: 50;
       }
       if(plan.equals("full coverage")){
           agePrices = (age<25)? 160 :120;
           milesPrice =  (miles<=10)? 20:(miles>10&&miles<=50)? 40: 70;
       }

       double totalPrices = agePrices + milesPrice;

       if(antiTheftDevice.equals("yes")){
           totalPrices *= 0.95; // discount 5%
       }
       if (accident.equals("yes")){
           totalPrices *= 1.15; // extra 15%
       }else{
           totalPrices *= 0.90; // discount 10%
       }
       if(married.equals("yes")){
           totalPrices *= 0.95; // discount 5%
       }


        System.out.println("Your total price is: $" +totalPrices);









        }
    }
/*
6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount



 */
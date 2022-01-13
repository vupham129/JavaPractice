package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String splitOrNoSplit = scan.next().toLowerCase();// if the user enter YES, or yes
        System.out.println("Enter the number of people");
        int numOfPeople = scan.nextInt();
        System.out.println("Enter the check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("How was the service quality?");
        String serviceQuality = scan.next().toLowerCase();// regardless enter user enter

        String result = "";
       if(splitOrNoSplit.equals("Yes") ) {

           if (serviceQuality.equals("Excellent")) {
               double totalTip = checkAmount * 0.25;
               double totalPay = checkAmount + totalTip;
               double totalPerPerson = totalPay / numOfPeople;
               double tipPerPerson = totalTip / numOfPeople;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip +
                       "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson;
           } else if (serviceQuality.equals("Great")) {
               double totalTip = checkAmount * 0.20;
               double totalPay = checkAmount + totalTip;
               double totalPerPerson = totalPay / numOfPeople;
               double tipPerPerson = totalTip / numOfPeople;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip +
                       "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson;
           } else if (serviceQuality.equals("Good")) {
               double totalTip = checkAmount * 0.15;
               double totalPay = checkAmount + totalTip;
               double totalPerPerson = totalPay / numOfPeople;
               double tipPerPerson = totalTip / numOfPeople;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip +
                       "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson;
           } else if (serviceQuality.equals("Fair")) {
               double totalTip = checkAmount * 0.10;
               double totalPay = checkAmount + totalTip;
               double totalPerPerson = totalPay / numOfPeople;
               double tipPerPerson = totalTip / numOfPeople;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip +
                       "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson;
           } else {
               double totalTip = checkAmount * 0.05;
               double totalPay = checkAmount + totalTip;
               double totalPerPerson = totalPay / numOfPeople;
               double tipPerPerson = totalTip / numOfPeople;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip +
                       "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson;
           }

       }else{
           if (serviceQuality.equals("Excellent")) {
               double totalTip = checkAmount * 0.25;
               double totalPay = checkAmount + totalTip;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip;
           } else if (serviceQuality.equals("Great")) {
               double totalTip = checkAmount * 0.20;
               double totalPay = checkAmount + totalTip;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip;
           } else if (serviceQuality.equals("Good")) {
               double totalTip = checkAmount * 0.15;
               double totalPay = checkAmount + totalTip;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip;
           }else if (serviceQuality.equals("Fair")) {
               double totalTip = checkAmount * 0.10;
               double totalPay = checkAmount + totalTip;
               result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip;
           }else{
                   double totalTip = checkAmount * 0.05;
                   double totalPay = checkAmount + totalTip;
                   result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip;
           }


       }

        System.out.println(result);

       scan.close();



















    }
}
/*
2. Create a class called TipCalculator, write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given. There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */
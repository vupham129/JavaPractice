package day13_String;

import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A valid passport (Yes or No)?");
        String validPP = sc.next();

        String result = "";

        if(validPP.equals("Yes") || validPP.equals("yes")) {
            sc.nextLine();
            System.out.println("Which country will you travel to?");
            String countryName = sc.nextLine();
            System.out.println("How many bags will you take with you?");
            byte numberOfBags = sc.nextByte();
            System.out.println("How many people will you travel with?");
            short numOfPeople = sc.nextShort();
            sc.nextLine();
            System.out.println("Enter name of people will travel with");
            String nameOfPeople = sc.nextLine();

            if (numOfPeople <= 3) {
                int ticketPrice = 1000;
                int bagPrice = numberOfBags * 50;
                int peopleTravelWith = 100*numOfPeople;
                int costAmount = ticketPrice - peopleTravelWith + bagPrice;
                result = "Your ticket is booked to " + countryName +
                        ". We have charged extra for the " + numberOfBags + " bags but you are traveling with " + numOfPeople +
                        "people so we are giving a discount. Your total cost is $" + costAmount;

            } else {
                int ticketPrice = 1000;
                int bagPrice = numberOfBags * 50;
                int maximumDiscount = 300;
                int costAmount = ticketPrice - maximumDiscount + bagPrice;
                result = "Your ticket is booked to " + countryName +
                        ". We have charged extra for the " + numberOfBags + " bags but you are traveling with " + numOfPeople +
                        "people so we are giving a discount. Your total cost is $" + costAmount;
            }
        }


        if(validPP.equals("No") || validPP.equals("no") ) {
           System.out.println("When was your passport expired?");
           int years = sc.nextInt();
           sc.nextLine();
           System.out.println("Which country will you plan to travel to?");
           String countryPlan =  sc.nextLine();
           System.out.println("Will you be traveling in the next year?");
           String nextYearTravel = sc.next();
            if (nextYearTravel.equals("Yes") ||nextYearTravel.equals("yes") ) {
                int feeRenewal = 200;
                int currentYear = 2021;
                int extraChargeEachYear = (currentYear -years) * 75;
                int totalCost = feeRenewal + 100 + extraChargeEachYear;
                result = "Looks like your passport has been expired for " + (2021-years) + "year, but not to worry we will get it ready for you to travel to "
                        + countryPlan + ". Your total cost has come out to $" + totalCost;
            } else {
                int feeRenewal = 200;
                int currentYear = 2021;
                int extraChargeEachYear = (currentYear -years) * 75;
                int totalCost = feeRenewal - 50 + extraChargeEachYear;
                result = "Looks like your passport has been expired for " + (2021-years) + "year, but not to worry we will get it ready for you to travel to "
                        + countryPlan + ". Your total cost has come out to $" + totalCost;
            }
        }


        System.out.println(result);


        sc.close();











    }
}
/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many numberOfBags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfnumberOfBags numberOfBags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."

 */
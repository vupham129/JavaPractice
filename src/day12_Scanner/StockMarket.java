package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many total shares you have already?");
        int share = scan.nextInt();
        if(share>0){
            System.out.println("How much your total value in the stock market is?");
            double totalValue = scan.nextDouble(); // no type $ on the console
            scan.nextLine();// extra line in order to enter the company name.
            System.out.println("Enter the name of the company you have the most shares in");
            String companyName = scan.nextLine();
            System.out.println("\"Your total stock market holding is $"+totalValue+" which is made up of "+share+
                            " shares. " +companyName+ " is your company holdings\"");
        }





        scan.close();
    }
}
/*
7. StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */
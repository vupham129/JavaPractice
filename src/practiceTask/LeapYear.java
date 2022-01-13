package practiceTask;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = input.nextInt();

        boolean isLeapyear = year%4 == 0 ; // if the remainder of year divided 4 is equal 0

        System.out.println(year + " is leap year: " + isLeapyear);

        System.out.println("---------------------------------------");

       if(isLeapyear){
           System.out.println("Congratulations your year is Leap");
        }else{
       System.out.println("I am sorry, try another year");
        }

        System.out.println("--------------------------------");
        String a = "Congratulations your year is Leap",
              b = "I am sorry, try another year";


       String str = (isLeapyear) ? a : b;
        System.out.println(str);


    }
}
/*
 2. create a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year
 */
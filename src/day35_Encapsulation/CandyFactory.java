package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        Candies candy1 = new Candies("m&m", 2, 0, false);
        Candies candy2 = new Candies("kit kat", 5,3.5,false);
        Candies candy3 = new Candies("reese's", 5,2.5,true);
        Candies candy4 = new Candies("milk", 6, 0, false);
        Candies candy5 = new Candies("Peanut", 7, 2.25, true);

        System.out.println(candy1);
        System.out.println(candy2);
        System.out.println(candy3);
        System.out.println(candy4);
        System.out.println(candy5);

        Candies[] candies = {candy1,candy2,candy3,candy4,candy5};

        ArrayList<Candies> candyLists = new ArrayList<>(Arrays.asList(candies));

        for (Candies each : candyLists) {
            System.out.println(each.getBrand()+" : "+each.getPrice());
        }









    }
}
/*
 1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */

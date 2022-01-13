package day12_Scanner;

import java.util.Scanner;

public class PeopleLive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many people do you live with?");
        byte numOfPeople = scan.nextByte();
        String result = "";

        if(numOfPeople>0 && numOfPeople<3){
            result = "Live with less than 3 people";
        }else if(numOfPeople>=3 && numOfPeople<=6){
            result = "Live with 3-6 people";
        }else if(numOfPeople>6){
            result = "Live with \"more than 6 people\"";
        }else{
            result = "Invalid number of people";
        }

        System.out.println(result);

        scan.close();


    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */
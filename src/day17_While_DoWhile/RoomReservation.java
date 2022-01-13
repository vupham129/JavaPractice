package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? yes/no");
        String ans = scan.next().toLowerCase();

        while( !(ans.equals("yes")||ans.equals("no"))){
            System.err.println("Invalid entry, please re-enter your answer");
            ans = scan.next().toLowerCase();
        }

        if(ans.equals("yes")){
            scan.nextLine();
            System.out.println("Which type of room do you want to reserve?");
            String roomType = scan.nextLine();
            while( !(roomType.equalsIgnoreCase("King Bed") ||
                    roomType.equalsIgnoreCase("Queen Bed") ||
                    roomType.equalsIgnoreCase("Single Bed"))){
                System.err.println("Invalid room, please reselect the room");
                roomType = scan.nextLine();
            }
            if(roomType.equalsIgnoreCase("King Bed") ||
                    roomType.equalsIgnoreCase("Queen Bed") ||
                    roomType.equalsIgnoreCase("Single Bed")) {


                if (roomType.equalsIgnoreCase("King Bed")) {
                    int price = 120;
                    System.out.println("Your reserved room is: " + roomType + " and total price of the room is: $" + price);
                } else if (roomType.equalsIgnoreCase("Queen Bed")) {
                    int price = 100;
                    System.out.println("Your reserved room is: " + roomType + " and total price of the room is: $" + price);
                } else {
                    int price = 80;
                    System.out.println("Your reserved room is: " + roomType + " and total price of the room is: $" + price);
                }
            }


        }else{
            System.out.println("have a nice day");
        }


    }
}

/*
 5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */
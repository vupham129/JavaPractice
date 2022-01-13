package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kingPrice = 120, queenPrice = 100, singlePrice = 80;
        int totalPriceEachRoom = 0;
        int totalPrice = 0;
        while(true){

            System.out.println("Which bedroom do you want to reserve?");
            String room = scan.next().toLowerCase();
            System.out.println("How many nights do you want to book?");
            int stay = scan.nextInt();

            System.out.println("Would you like to reserve another room?");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes")||a.equals("no"))){
                System.err.println("Invalid entry, please re-enter your answer");
                a = scan.next().toLowerCase();
            }

            if(room.equals("king")){
                totalPriceEachRoom = kingPrice*stay;
            }
            if(room.equals("queen")){
                totalPriceEachRoom = queenPrice*stay;
            }
            if(room.equals("single")){
                totalPriceEachRoom = singlePrice*stay;
            }
            totalPrice += totalPriceEachRoom;

            if(a.equals("no")){
                System.out.println(totalPrice);
                break;

            }




        }








scan.close();




    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


 */
package day16_PracticeTask10;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        for(int i = 1; i <= 5; i++) { // enter number 5 times
            System.out.println("Enter number:");
            int num = sc.nextInt();
            if(num>0){ // postive condition
                pos += 1; // to calcualte how many numbers are postive
            }
            if(num<0){
                neg += 1;
            }
        }

        System.out.println(pos+" postive and "+neg+" negative");



        sc.close();
    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */
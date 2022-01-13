package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray_Task5 {
    public static void main(String[] args) {
        /*
        5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want to enter numbers?");
        int length = scan.nextInt();
        if(length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[] array = new int[length];
        for (int k = 0; k < length; k++) {
            System.out.println("Enter a number:");
            array[k] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int[] reversedArray = new int[array.length];

        for(int i = 0, j = reversedArray.length; i< array.length; i++, j--){
            reversedArray[i]=j;
        }
        System.out.println(Arrays.toString(reversedArray));

scan.close();



    }
}

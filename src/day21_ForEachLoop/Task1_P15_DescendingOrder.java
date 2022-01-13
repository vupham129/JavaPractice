package day21_ForEachLoop;

import java.util.Arrays;

public class Task1_P15_DescendingOrder {
    public static void main(String[] args) {
        // 1. Write a program that sort the array of integer in descending order

        int[] array = { 10, 2,4,7,9,6,3,2,1,20,30};
        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] +" ");
        }




    }
}

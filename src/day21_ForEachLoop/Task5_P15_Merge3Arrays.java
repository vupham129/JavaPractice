package day21_ForEachLoop;

import java.util.Arrays;

public class Task5_P15_Merge3Arrays {
    /*
     5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
     */
    public static void main(String[] args) {
       int[] arr1 = {30, 10, 20}; //3
       int[] arr2 = {15, 40, 25, 35};//4
       int[] arr3 = {8, 9, 17, 5, 4, 1};//6

       int[] merge = new int[arr1.length+ arr2.length+ arr3.length];//13

        int j = 0; // j: index number of merge
        for (int i : arr1) {
            merge[j++]= i;
        }
        for (int k : arr2) {
            merge[j++]=k;
        }

        for (int l : arr3) {
            merge[j++]=l;
        }


        System.out.println(Arrays.toString(merge));












    }
}

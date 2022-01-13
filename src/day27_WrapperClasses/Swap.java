package day27_WrapperClasses;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        arr = swap(arr,2,4);
        System.out.println(Arrays.toString(arr));


    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static int[] swap(int[] array, int i, int j){

        for (int k = 0; k < array.length; k++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;

    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static double[] swap(double[] array, int i, int j){

        for (int k = 0; k < array.length; k++) {
            double temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;

    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static char[] swap(char[] array, int i, int j){

        for (int k = 0; k < array.length; k++) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;

    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static String[] swap(String[] array, int i, int j){

        for (int k = 0; k < array.length; k++) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;

    }
    
    
    
    
}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array

 */
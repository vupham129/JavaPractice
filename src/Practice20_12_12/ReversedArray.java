package Practice20_12_12;

import java.util.Arrays;

public class ReversedArray {
    /*
    8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
     */

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        int[] reverse = reverse(arr);

        System.out.println(Arrays.toString(reverse));



    }


    public static int[] reverse(int[] arr){

        int[] reverse = new int[arr.length];

        int j = 0; // j: index number of reverse

        for (int i = arr.length - 1; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;



    }



}

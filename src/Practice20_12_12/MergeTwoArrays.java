package Practice20_12_12;

import java.util.Arrays;

public class MergeTwoArrays {
    /*
    7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] merge = merge(arr1,arr2);
        System.out.println(Arrays.toString(merge));


    }


    public static int[] merge(int[] arr1, int[] arr2){
        int[] merge = new int[arr1.length+ arr2.length];

       int j = 0; // j: index number of merge array
        for (int each : arr1) {
            merge[j++]= each;
        }
        for (int each : arr2) {
            merge[j++]= each;
        }

        return merge;



    }





}
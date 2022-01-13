package day24_CustomeMethods_Return;

import java.util.Arrays;

public class Task5_MergeTwoArray {
    //5. create a method that can merge two arrays and return the new array


    public static void main(String[] args) {
        String[] arr1 = {"anna", "cindy", "nurlan"};
        String[] arr2 = {"steven", "main", "van", "amanda", "jonnel"};

        String[] names = mergeTwoArrays(arr1,arr2);

        System.out.println(Arrays.toString(names));

    }




    public static String[] mergeTwoArrays(String[] arr1, String[] arr2){

        String[] merge = new String[arr1.length+ arr2.length];
        int i = 0;
        for (String each : arr1) {
            merge[i++] = each;
        }

        for (String each : arr2) {
            merge[i++] = each;
        }

        return merge;


    }





}

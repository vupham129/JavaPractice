package Practice20_12_12;

import java.util.Arrays;

public class AddElement {
    /*
      6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

     */
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int num = 4;

        int[] addElement = addElement(arr, num);

        System.out.println(Arrays.toString(addElement));



    }


    public static int[] addElement(int[] arr, int num){

        int[] result = new int[arr.length+1];

        int j = 0; // j: index number of result array
        for (int i = 0; i < arr.length; i++) { // i: index number of arr array
             result[j++]= arr[i]; //
             if(result[result.length-1]==0){// if last index number of result == 0, then assign to integer num
                 result[result.length-1]=num;
             }
        }

        return result;
    }





}

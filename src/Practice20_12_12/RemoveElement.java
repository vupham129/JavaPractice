package Practice20_12_12;

import java.util.Arrays;

public class RemoveElement {
    /*
    10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

     */

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60};
        int index = 2;

        int[] result = removeElement(array, index);

        System.out.println(Arrays.toString(result));



    }


    public static int[] removeElement(int[] array, int index){

        int[] result = new int[array.length-1];
        int j = 0;// j: index number of result
        for (int i = 0; i < array.length; i++) {
            if(i==index){// i: index number of array, if index number of array == int index then skip that index number
                continue;
            }
            result[j++] = array[i];
        }

        return result;





    }






}

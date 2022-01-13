package day24_CustomeMethods_Return;

import java.util.Arrays;

public class Task4_ReversedArray {
    // 4. create a method that return the reversed array


    public static void main(String[] args) {

        String[] words = { "Java", "Python", "Sugar", "Candy"  };

        String[] reversed = reversedArray(words);

        System.out.println("reversed = " + Arrays.toString(reversed));


    }






    public static String[] reversedArray(String[] words){

        String[] reversed = new String[words.length];

        int j = 0; // index number of reversed array
        for (int i = words.length - 1; i >= 0; i--, j++) {// i: index number of words array
            reversed[j] = words[i];
        }

        return reversed;




    }





}

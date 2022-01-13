package day23_CustomMethods_Void;

public class Task13_PrintEachElement {
    //13.  create a method named printEachElement that can print each elements of an integer array

    public static void main(String[] args) {

        printEachElement(  new int[100] );

    }

    public static void printEachElement(int[] numbers){

        for (int i = 1; i <= numbers.length ; i++) {
            System.out.print(i+" ");
        }


    }


}

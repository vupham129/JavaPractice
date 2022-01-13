package day23_CustomMethods_Void;

public class Task1_OddNumber {
    //1. create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void main(String[] args) {

        oddNumbers(1,100);


    }


    public static void oddNumbers(int x, int y){
        for (int i = x; i <= y ; i++) {
            if(i%2!=0){ // if the number i divided 2 not equal 0, then the number x to y is odd
                System.out.print(i+" ");
            }

        }


    }




}

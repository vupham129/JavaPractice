package day15_ForLoop;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i <= 100; i+= 2){
            sum += i;
        }
        System.out.println(sum); //2550


    }
}
/*
1. Write a program that can return the sum of even numbers between 1 to 100

 */
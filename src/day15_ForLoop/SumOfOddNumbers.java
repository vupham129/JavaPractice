package day15_ForLoop;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 99; i += 2){
            sum += i;
        }
        System.out.println(sum); //2500
    }
}
/*
2. Write a program that can return the sum of odd numbers between 1 to 100
 */
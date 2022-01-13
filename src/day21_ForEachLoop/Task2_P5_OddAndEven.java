package day21_ForEachLoop;

public class Task2_P5_OddAndEven {
    /*
    2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int countOddNumber = 0;
        int countEvenNumber = 0;

        for (int number : numbers) {
            if(number%2==0){
                countEvenNumber++;
            }else{
                countOddNumber++;
            }
        }

        System.out.println("countEvenNumber = " + countEvenNumber);
        System.out.println("countOddNumber = " + countOddNumber);


    }
}

package day24_CustomeMethods_Return;

public class Task2_MaxInArray {
    //2. create a method that can return the maximum number from an array of integer


    public static void main(String[] args) {
        int[] num = {10,20,40,400,50,60,70,100};

        int maxNumber = max(num);

        System.out.println("maxNumber = " + maxNumber);


    }

    public static int max(int[] numbers){

        int max = numbers[0]; // pretend numbers of index 0 is maximum number

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];

            }
        }
        return max;


    }



}

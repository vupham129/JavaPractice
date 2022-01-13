package day24_CustomeMethods_Return;

public class Task3_MinInArray {
    //  3. create a method that can return the minimum number from an array of integers

    public static void main(String[] args) {

        int[] nums = { 0,2,6,7,10,-5,-10,100,400,1000};

        int minNumber = min(nums);

        System.out.println("minNumber = " + minNumber);


    }

    public static int min(int[] numbers){

        int min = numbers[0];// pretend the number of index 0 is minimum number

        for (int number : numbers) {
            if(number<min){
                min = number;
            }

        }

        return min;



    }


}

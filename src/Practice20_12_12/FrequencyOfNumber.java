package Practice20_12_12;

public class FrequencyOfNumber {
    /*
     5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

     */
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        int num = 1;

        int count = frequency(array, num);
        System.out.println(count);

    }


    public static int frequency(int[] array, int num){
        int count = 0;
        for (int eachNum : array) {
            if(eachNum==num){
               count++;
            }
        }

        return count;






    }





}

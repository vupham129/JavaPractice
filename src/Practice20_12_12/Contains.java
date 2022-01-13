package Practice20_12_12;

public class Contains {
    /*
    9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 5, 6, 7};
        int num = 2;

        String result = contains(arr, num);

        System.out.println(result);


    }


    public static String contains(int[] arr, int num) {
        String result = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) { // i: index number of each element in the array
            if (arr[i] == num) { // if each element equal integer number then count
                count++;

            }
            if (count >= 1) { // if count greater than or equal than 1, then the array contains the integer num
                result = "true";
            } else {
                result = "false";
            }

        }

        return result;

    }

}
package practiceTask;
import java.util.Scanner;
public class NumberDividedFor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = input.nextInt();
        boolean isNumberDividedFor6 = number% 6 == 0;
        if(isNumberDividedFor6){
            System.out.println("Congratulations! your number can divide for 6 without remainder");
        }else{
            System.out.println("I am sorry, try another number");
        }


    }
}

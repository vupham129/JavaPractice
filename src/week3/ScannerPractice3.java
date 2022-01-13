package week3;
import java.util.Scanner;
public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");

        int score = input.nextInt(); // 85Enter

        input.nextLine();//Enter-- have to create another nextLine method to take the enter of 85 score

        System.out.println("Enter your fullname");
        String fullName = input.nextLine(); // will enter the full name

        System.out.println("score = " + score);
        System.out.println("fullName = " + fullName);
    }


}

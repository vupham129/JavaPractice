package week3;
import java.util.Scanner;
public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first sentence");
        String firstSentence = input.nextLine(); // disadvantage: take everything until press enter

        System.out.println("Enter your second sentence");

        String secondSentence = input.nextLine();

        System.out.println("firstSentence = " + firstSentence);
        System.out.println("secondSentence = " + secondSentence);



    }

}

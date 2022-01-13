package day16_PracticeTask10;


import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        sc.close();
        if(sentence.toLowerCase().contains("cat") == sentence.toLowerCase().contains("dog")){
            System.out.println("true");
        }



    }
}
/*

5. write a program to print true if the string "cat" and "dog" appear the same number
of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */
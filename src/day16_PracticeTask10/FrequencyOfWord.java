package day16_PracticeTask10;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int count = 0;
        for(int i = 0; i<sentence.length(); i++){
            if(sentence.contains("Java")){
                sentence = sentence.replaceFirst("Java","");
                count ++;
            }
        }
        System.out.println(count);

    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */
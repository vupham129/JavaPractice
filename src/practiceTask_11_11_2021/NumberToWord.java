package practiceTask_11_11_2021;

public class NumberToWord {
    public static void main(String[] args) {
        int number = 9;
        String word = "";

        if(number == 1){
            word = "One";
        }else if(number == 2){
            word = "Two";
        }else if(number == 3){
            word = "Three";
        }else if(number == 4){
            word = "Four";
        }else if(number == 5){
            word = "Five";
        }else if(number == 6){
            word = "Six";
        }else if(number == 7) {
            word = "Seven";
        }else if(number == 8){
            word = "Eight";
        }else{
            word = "Nine";
        }

        System.out.println("Number to word is: "+ word);





    }
}
/*
1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */
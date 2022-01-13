package day23_CustomMethods_Void;

public class Task12_PrintEachChar {
    // 12.  create a method named printEachChar that can print each characters of a string

    public static void main(String[] args) {

        printEachChar("Java is programming language");

    }


    public static void printEachChar(String words){
        for (int i = 0; i < words.length(); i++) {

            char eachChar = words.charAt(i);
            System.out.println(eachChar);

        }




    }



}

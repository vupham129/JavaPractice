package day27_WrapperClasses;

public class Task4 {
    public static void main(String[] args) {
        String str = "JAVA java";
        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachCh = str.charAt(i);
            if(Character.isUpperCase(eachCh)){
                upperCase++;
            }
            if(Character.isLowerCase(eachCh)){
                lowerCase++;
            }
        }
        boolean result = false;
        if(upperCase==lowerCase){
            result = true;
        }
        System.out.println("result = " + result);


    }
}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */
package day27_WrapperClasses;

public class RetrieveLetters {
    public static void main(String[] args) {
        String str = "Wooden Spoon!";

        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) {
            char eachCh = str.charAt(i);
            if(Character.isLetter(eachCh)){
                letters += eachCh;
            }
            if(Character.isDigit(eachCh)){
                digits += eachCh;
            }
            if( !Character.isLetterOrDigit(eachCh)){
                specialChars += eachCh;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";

 */
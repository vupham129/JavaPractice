package practiceTask_11_11_2021;

public class CharacterIdentity {
    public static void main(String[] args) {

        char character =' ';
        String ch = "";

        boolean result = character >=  33 && character <= 47 || character >= 58 && character <= 64
                        || character >= 123 && character <= 126|| character >= 91 && character <= 96;
        boolean result1 = character >= 48 && character <= 57 ;
        boolean result2 = character >= 65 && character <= 90 || character >= 97 && character <= 122;

        if (result){
            ch = "Special Character";
        }else if(result1){
            ch = "Digit";
        }else if(result2){
            ch = "Alphabetic Character(A~Z or a~z)";
        }else{
           ch = "Invalid character";
        }
        System.out.println("ch = " + ch);







    }
}
/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */
package Practice20_12_12;

public class Palindrome {
    /*
    4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
     */


    public static void main(String[] args) {

        String str = "level";
        String isPalindrome = isPalindrome(str);

        System.out.println(isPalindrome);




    }

    public static String isPalindrome(String str){
        String reverse = "";
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        if(reverse.equals(str)){
          result = "true";
        }else{
            result = "false";
        }

        return result;
    }



}

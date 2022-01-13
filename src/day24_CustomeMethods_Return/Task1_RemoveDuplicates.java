package day24_CustomeMethods_Return;

public class Task1_RemoveDuplicates {
    //1. create a method that can remove duplicated characters from a string and returns the new value


    public static void main(String[] args) {
        String str = "aaaaaaaaaaabbbbbbbbbbbkkkkkkkaaahuslk";
        str = removeDuplicated(str);

        System.out.println(str);
    }


    public static String removeDuplicated(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result+=each;
            }


        }

        return result;

    }



}

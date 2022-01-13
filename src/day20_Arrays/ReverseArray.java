package day20_Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] names = {"Halimila", "Rezk", "Alim", "Muhsen", "Komurcu",
                "Gungor", "Enes", "Demianiv", "Fadime", "Casandra"};


       for (int i = 0; i < names.length; i++) {
            String eachName = names[i];// if i = 0 => eachName = "Halimila"
            String reverse = "";
            for (int j = eachName.length() -1 ; j>=0; j--) {// eachName = "Halimila" => reverse = "alimilaH", start from the last character of the name
                reverse = reverse+ eachName.charAt(j);
            }
           System.out.println(reverse);
       }




    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */
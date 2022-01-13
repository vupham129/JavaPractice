package day21_ForEachLoop;

public class Task4_P15_Palindromes {
    /*
     4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
     */
    public static void main(String[] args) {

        String[] arr = {"anna", "level", "Java"};

        int count = 0;

        for (String each : arr) { // each : anna, level, Java
            String reversedEach = "";
            for(int i = each.length()-1; i>=0; i--){// i: index number of each element
                reversedEach += each.charAt(i); // anna, level, avaJ
            }
            if(reversedEach.equals(each)) {// if each word of reversed equals each element
                count++;
            }
        }

        System.out.println(count);








    }


}

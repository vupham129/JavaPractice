package day23_CustomMethods_Void;

public class Task15_FullName {
    /*
    15.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"

     */

    public static void main(String[] args) {

        fullName("cYdEo", "SCHOOL");

    }


    public static void fullName(String firstName, String lastName){

            String firstCharOfFN = firstName.substring(0,1).toUpperCase();
            String remainOfFN = firstName.substring(1).toLowerCase();


            String firstCharOfLN = lastName.substring(0,1).toUpperCase();
            String remainOfLN = lastName.substring(1).toLowerCase();

            String fullName = firstCharOfFN+remainOfFN +" "+firstCharOfLN+remainOfLN;

        System.out.println("fullName = " + fullName);


    }



}

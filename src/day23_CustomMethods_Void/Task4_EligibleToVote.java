package day23_CustomMethods_Void;

public class Task4_EligibleToVote {

    /*
    4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!

     */


    public static void main(String[] args) {

        eligibleToVote(18, false);

    }

     public static void eligibleToVote(int age, boolean isUSACitizen){
         if(age>=18 && isUSACitizen == true){
             System.out.println("Congratulations! You are eligible to vote");
         }else{
             System.out.println("Sorry, you are not eligible to vote");
         }



     }






}

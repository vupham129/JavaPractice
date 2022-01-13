package day23_CustomMethods_Void;

public class Task3_EligibleToBuyAlcohol {
    //3. create a method that can check if a person is eligible to buy alcohol
    public static void main(String[] args) {

        eligibleToBuyAlcohol(20, true);

    }


    public static void eligibleToBuyAlcohol(int age, boolean hasID){
        if (age>=21 && hasID == true){
            System.out.println("You are eligible to buy alcohol!");
        }else{
            System.out.println("You are under 21 years old, not eligible to buy alcohol!");
        }

    }





}

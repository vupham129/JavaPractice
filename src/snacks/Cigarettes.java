package snacks;

public class Cigarettes {
    public static void main(String[] args) {
        String name = "George";
        byte age = 20;

        boolean isEligible = age >= 21;

        if(isEligible){
            System.out.println(name + " is eligible to buy Cigarettes: " + isEligible);
        }
        if(!isEligible){
            System.out.println(name + " is eligible to buye Cigarettes: " + isEligible);
        }







    }

}
/*
1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */
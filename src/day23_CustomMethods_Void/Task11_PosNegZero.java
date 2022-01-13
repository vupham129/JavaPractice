package day23_CustomMethods_Void;

public class Task11_PosNegZero {
    //11. create a method that can if the given integer is positive, negative or zero


    public static void main(String[] args) {

        typeOfNumber(0);

    }

    public static void typeOfNumber(int number){
        if(number>0){
            System.out.println(number+" is positive number.");
        }else if(number==0){
            System.out.println(number+ " is zero");
        }else{
            System.out.println(number+" is negative number.");
        }




    }



}

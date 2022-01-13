package day23_CustomMethods_Void;

public class Task9_ConvertDollarToLira {
    //9. create a method that can can convert dollar to lira

    public static void main(String[] args) {

        dollarToLira(100);

    }


    public static void dollarToLira(double dollar){
        double oneLira = 13.79;

        if(dollar>0){
            double dollarToLira = dollar*oneLira;
            System.out.println("$"+dollar+" = "+dollarToLira+" lira.");

        }else{
            System.out.println("Invalid amount");
        }



    }


}

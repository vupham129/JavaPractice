package day23_CustomMethods_Void;

public class Task10_ConvertKgToLb {
    //10. create a method that can convert kg to lb

    public static void main(String[] args) {

        kgToLb(2.5);

    }

    public static void kgToLb(double kg){

        double lb = 2.2;

        if(kg>0){
            double kgToLb = kg*lb;
            System.out.println(kg+" kg is equal "+kgToLb+" lbs.");

        }else{
            System.out.println("Invalid amount");
        }


    }


}

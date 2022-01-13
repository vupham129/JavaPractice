package day23_CustomMethods_Void;

public class Task8_CovertDollarToEuro {
    // 8. create a method that can convert dollar to euro

    public static void main(String[] args) {

        dollarToEuro(-100);

    }


    public static void dollarToEuro(double dollar) {

        double euro = 0.89;
        if (dollar > 0) {
            double dollarToEuro = dollar * euro;

            System.out.println("$" + dollar + " = " + dollarToEuro+" euro.");

        }else{
            System.out.println("Invalid amount");
        }

    }


}

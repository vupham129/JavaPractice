package day23_CustomMethods_Void;

public class Task14_Calculator {
    //14. create a method named calculator that passes three arguments (num1, num2, mathOperator),
    // prints the calculation result


    public static void main(String[] args) {

        calculator(10,20,'$');

    }

    public static void calculator(int num1, int num2, char mathOperator){

        switch (mathOperator){
            case '+':  System.out.println("result = " + (num1+num2)); break;
            case '-':  System.out.println("result = " + (num1-num2)); break;
            case '*':  System.out.println("result = " + (num1*num2));  break;
            case '/': System.out.println("result = " + (num1/num2)); break;
            default:
                System.out.println("Invalid math operator");
        }



    }



}

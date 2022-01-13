package practiceTask_11_11_2021;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 10,
                n2 = 20,
                number;
        char mathOperator = '8';

        switch(mathOperator){
            case '+': // if n1 + n2
                number = n1 + n2;
                System.out.println(number);
                break;
            case '-': // if n1 - n2
                number = n1 - n2;
                System.out.println(number);
                break;
            case '*': // n1 * n2
                number = n1 * n2;
                System.out.println(number);
                break;
            case '/': // n1 / n2
                number = n1 / n2;
                System.out.println(number);
                break;

            default:
                System.out.println("Invalid Operator");
                break;


        }

        System.out.println("------------------------------");
        if(mathOperator == '+') {
            number = n1 + n2;
            System.out.println(number);
        }else if(mathOperator == '-'){
            number = n1 - n2;
            System.out.println(number);
        }else if(mathOperator == '*'){
            number = n1 * n2;
            System.out.println(number);
        }else if(mathOperator == '/'){
            number = n1 / n2;
            System.out.println(number);
        }else {
            System.out.println("Invalid Operator");
        }









    }
}
/*
2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */
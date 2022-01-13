package day11_Switch_Scanner;

public class CappuccinoBuyer3 {
    public static void main(String[] args) {
//Solution 3: if & switch statements mixed
        String size = "grande",
                price ="",
                calories= "",
                result = "";
        boolean validSizes = size == "tall" || size == "grande" || size == "venti";
        if(validSizes){
            switch (size){
                case "tall":
                    price = "$3.69";
                    calories = "90 calories";
                    result = "price: " +price +"\ncalories: "+ calories;
                    break;
                case "grande":
                    price = "$3.99";
                    calories = "120 calories";
                    result = "price: " +price +"\ncalories: "+ calories;
                    break;
                default:
                    price = "$4.29";
                    calories = "150 calories";
                    result = "price: " +price +"\ncalories: "+ calories;

            }

        }else{
            result = "Invalid Size";
        }
        System.out.println("size: " + size + "\n"+result);





    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
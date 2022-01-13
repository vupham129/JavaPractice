package desserts;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 15;
        String result = "";
         if(number%5 == 0 && number%3 == 0){
             result = "FizzBuzz";
         }else if(number%3 == 0){
             result = "Fizz";
         }else if(number%5 ==0){
             result = "Buzz";
         }else{
             result = "Not correct input";
         }

        System.out.println("result = " + result);
    }
}
/*
if number can divide to 5 print Fizz
if number can divide to 3  print Buzz

if number can devide 5 and 3 print FizzBuzz
1. Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3, prints "Buzz" if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz
 */



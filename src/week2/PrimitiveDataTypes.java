package week2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //Integer: age, year, salary, miles
byte age = 35; // if you want to update the age to 65, just fit the number
short year = 2000;
int salary= 100000; // preferred
long miles = 999999999L; // have to add lower case l or upper case L at the end so the compiler can translate

        // Decimals: tax, pi
        double tax = 0.26; // preferred
        float pi = 3.14f; // have to add lower case f or upper case F at the end of the data

        // symbols: @, #
char ch1 = '@'; // have to add the single quote everytime for the data
        char ch2 = '#';
        /*
         the variables name have to be meaningful and readable, can not start with digit,
         if you want to include special character only $ and _
         */
        System.out.println(age); // no double quote for printing the number
        System.out.println(year);
        System.out.println(miles);

        boolean result1 = true;  // use boolean only True or False , and always lowercase for true or false
        boolean result2 = false;
        boolean result3 = 5 > 10;

        System.out.println(result3);

        int a = 100;
        int b = 200;
        boolean aIsGreaterThanB = a > b;
        System.out.println(aIsGreaterThanB);




    }





}
/*
Variables: - Variables are containers for storing data values
- improves the reusability of the data
-the value stored in a variable can be changed during program execution
-Varibales must be declared before use
DataType VariableName = Data; (VaribaleName has to be matching with data that we have)

 */

package week2;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(1000 + 2000);   // print method use
        System.out.println(2.5 + 3.5);

        System.out.println(100 - 30);
        int a= 300 - 100;
        System.out.println(a);
        System.out.println(20 * 6);
        System.out.println(5.5 * 7);

        System.out.println(10/4);  // the value is 2 because by default is integer
        System.out.println(10.0/4);// 2.5 expected
        System.out.println(10/4.0);// another way to get 2.5
        System.out.println(10.0/4.0);//2.5
        System.out.println(10d/4); // can add lower case d or D on any number

        System.out.println(20/6); //3
        System.out.println(20.0/6); // exact decimal result or add d or D

        System.out.println(10%4); //

        System.out.println(20%6);

        System.out.println(20%7);

    }
}
/*
+: addition, -: subtraction, *:Multiplication, /:Division, %:Remainder
in Math:
10 /4 = 2.5;

remainder: numerator - (denomirator * integer result (from 2.5))
           10 - (4 * 2) = 2
          20/6 = 3.33 / 20 - (6 * 3)= 2
          20/7 = 2.857 / 20- (7*2)=6
 */
package week2;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        // Implicit casting
        int a = 100;
        double b = a; //decimals ; implicit casting, it is automatic
        System.out.println(a);
        System.out.println(b);

        // Explicit casting
        double x = 20.5;
        int y = (int)x;
        System.out.println(x);
        System.out.println(y);
    }

}
/*
allows us to assign one primitive type value to another primitive type
there are two types of primitive type castings : implicit and explicit castings
Cast Operator is needed to manually convert a value
int number;
double dval = 32.33;
number= (int)dval;
(int): type in which you want to convert, dval: variable name which you want to convert
Implicit casting: casting smaller primitive types to larger primitive types
                  implicitly done by the compiler
Explicit casting: casting larger primitive types to smaller primitive types
                  must be done explicitly
                  have to write ()varibales for example: int y = (int)x;
 */
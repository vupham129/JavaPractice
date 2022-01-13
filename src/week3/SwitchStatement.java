package week3;

public class SwitchStatement {
    public static void main(String[] args) {
        int number = 8;

        //print the name is the day ==

        switch(number) {
            case 1: // case value has to be unique all the time
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break; // if forget to put break, it will print the next case as well

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default: // previous stmts are failed
                System.out.println("Invalid Number");
                break;
        }




    }
}
/*
it can not be long, double, float and boolean --> Switch stmt's expression must be evaluated to a single value
used to compare the value of a variable with multiple values and execute some stmts based on the match

switch(expression){
      case constant1:
           statements;
           breaks;
      case constant2:
           statements;
           breaks;
      default:
           statements;
           breaks;
}
 */
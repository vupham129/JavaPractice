package desserts;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 13;
        String days = "";
        if(month == 1){
            days = "30 days";
        }else if(month == 2){
            days = "28 days";
        }else if(month == 3){
            days = "31 days";
        }else if(month == 4){
            days = "30 days";
        }else if(month == 5){
            days = "31 days";
        }else if(month == 6){
            days = "30 days";
        }else if(month == 7){
            days = "31 days";
        }else if(month == 8){
            days = "31 days";
        }else if(month == 9){
            days = "30 days";
        }else if(month == 10){
            days = "31 days";
        }else if(month == 11){
            days = "30 days";
        }else if(month == 12){
            days = "31 days";
        }else{
            System.out.println("Invalid month");
        }
        System.out.println(days);
    }
}
/*
2. Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you, write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 */
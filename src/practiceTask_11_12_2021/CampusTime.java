package practiceTask_11_12_2021;

public class CampusTime {
    public static void main(String[] args) {
        int time = 26;
        boolean openTime = time >= 8 && time <= 23;
        boolean closedTime = time <= 7 && time <= 24;
        String result = "";
        if (time >= 1 && time <= 24) {
            if (openTime) {
                result = "Open";
            } else {
                result = "Closed";
            }
        } else {
            result = "Invalid hour";
        }

            System.out.println("result = " + result);


        }

}

/*
1.  Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been initialized,
 write a program that can find out if the campus is open or not. Campus is open from 8 am(8) to 11 pm (23)
 If user enters a time within the open time
 they should see message: “open”  but if the time entered is outside of operating hours they should see: “ closed”


 */
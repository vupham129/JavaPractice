package day11_Switch_Scanner;

public class AgeGroups1 {
    public static void main(String[] args) {
        int age = 1000 ;
        String result = "";
            switch ((1 <= age && age <= 2 ) ? 0 : (3 <= age && age <= 5) ? 1
                    :(6 <= age && age <= 9)? 2 :(10<= age && age <= 12)? 3
                    :(13 <= age && age <= 17)? 4 :(18<= age && age <= 20)? 5
                    :(21<= age && age<= 39)? 6 :(40 <= age && age <= 49)? 7
                    :(50<= age && age <= 54)? 8 :(55 <= age && age <= 64)? 9
                    :(65<= age && age<= 74)? 10 :(75<= age && age <= 84)? 11 :(age >= 85)? 12 : 13) {
                case 0:
                    result = "infant";
                    break;
                case 1:
                    result = "toddler";
                    break;
                case 2:
                    result = "Kid";
                    break;
                case 3:
                    result = "Pre-teen";
                    break;
                case 4:
                    result = "Teenager";
                    break;
                case 5:
                    result = "Young Adult";
                    break;
                case 6:
                    result = "Adult";
                    break;
                case 7:
                    result = "Young Middle-Aged Adult";
                    break;
                case 8:
                    result = "Middle-Aged Adult";
                    break;
                case 9:
                    result = "Very Young Senior Citizen";
                    break;
                case 10:
                    result = "Young Senior Citizen";
                    break;
                case 11:
                    result = "Senior Citizen";
                    break;
                case 12:
                    result = "Old Senior";
                    break;
                case 13:
                    result = "Invalid age";
                    break;

            }


        System.out.println(result);



        }


    }


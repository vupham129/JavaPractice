package day11_Switch_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        String ageGroup = "infant",
                result = "";

        switch (ageGroup){
            case "infant":
                result = "1-2 year";
                break;
            case "Toddler":
                result = "3-5 year";
                break;
            case "Kid":
                result = "6-9 year";
                break;
            case "Pre-Teen":
                result = "10-12 year";
                break;
            case "Teenager":
                result = "13-17 year";
                break;
            case "Young Adult":
                result = "18-20 year";
                break;
            case "Adult":
                result = "21-39 year";
                break;
            case "Young Middle-Aged Adult":
                result = "40-49 year";
                break;
            case "Middle-Aged Adult":
                result = "50-54 year";
                break;
            case "Very Young Senior Citizen":
                result = "55-64 year";
                break;
            case "Young Senior Citizen":
                result = "65-74 year";
                break;
            case "Senior Citizen":
                result = "75-84 year";
                break;
            case "Old Senior Citizen":
                result = "85+ year";
                break;
            default:
                result = "Invalid age group";

        }

        System.out.println(result);











    }
}
/*
6. write a program that can define the age groups of a person
                 age groups are:
                        infant ( 1 - 2 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

                NOTE: MUST USE switch statement


 */
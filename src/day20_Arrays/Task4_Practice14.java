package day20_Arrays;

import java.util.Arrays;

public class Task4_Practice14 {
    public static void main(String[] args) {
        /*
        4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A

         */
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        String[] report = new String[names.length];
        //1. write a program that can store the grades of the students in the array named grades
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>=90&& scores[i]<=100){
                grades[i]='A';
            }if(scores[i]>=80&& scores[i]<=89){
                grades[i]= 'B';
            }if(scores[i]>=0&&scores[i]<=79){
                grades[i]= 'C';
            }
        }
        System.out.println(grades);
        //2. print the grade report of each students in separate lines
        //         		Ex:
        //         			Anna's score is 90, and grade is A


        for (int i = 0; i < names.length; i++) { // i: index number of each element inside names
             report[i] = names[i]+"'s score is "+scores[i]+", and grade is "+grades[i];
       }
        for (int i = 0; i < report.length; i++) {
            System.out.println(report[i]);
        }






    }
}

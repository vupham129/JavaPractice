package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TotalNumbersOfGrade {
    /*
   8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F

     */
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

/*
        int gradeOfA = 0;
        int gradeOfB = 0;
        int gradeOfC = 0;
        int gradeOfD = 0;
        int gradeOfF = 0;


        for (Integer each : scores) {
            if(each>=0 && each<=100){
                int count = each>=90 ? gradeOfA++ :(each>=80)? gradeOfB++ :(each>=70)? gradeOfC++ :(each>=60)? gradeOfD++ : gradeOfF++;
            }
        }

        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);


 */
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
/*
        for (Integer each : scores) {
            if(each>=0 && each<=100){
                if(each>=90){
                    gradeOfA.add(each);
                }else if(each>=80){
                    gradeOfB.add(each);
                }else if(each>=70){
                    gradeOfC.add(each);
                }else if(each>=60){
                    gradeOfD.add(each);
                }else{
                    gradeOfF.add(each);
                }
            }
        }

 */

        for (Integer each : scores) {
            if(each>=0 && each<=100){
               boolean result = (each>=90)? gradeOfA.add(each) :(each>=80)? gradeOfB.add(each)
                        : (each>=70)? gradeOfC.add(each) : (each>=60)? gradeOfD.add(each) : gradeOfF.add(each);

            }
        }

        int countGradeA = 0;
        for (Integer each : gradeOfA) {
            countGradeA++;
        }
        int countGradeB = 0;
        for (Integer each : gradeOfB) {
            countGradeB++;
        }
        int countGradeC = 0;
        for (Integer each : gradeOfC) {
            countGradeC++;
        }
        int countGradeD = 0;
        for (Integer each : gradeOfD) {
            countGradeD++;
        }
        int countGradeF = 0;
        for (Integer each : gradeOfF) {
            countGradeF++;
        }

        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("countGradeA = " + countGradeA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("countGradeB = " + countGradeB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("countGradeC = " + countGradeC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("countGradeD = " + countGradeD);
        System.out.println("gradeOfF = " + gradeOfF);
        System.out.println("countGradeF = " + countGradeF);




    }
}

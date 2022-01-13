package week3;

public class MultiBranchIf {
    public static void main(String[] args) {

        int number = -100;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else { // number == 0
            System.out.println("Zero");
        }
        System.out.println("------------------");

        int score = 55;
        char grade; //A,B,C,D,F

        if (score >= 90){
            grade = 'A';
        }else if( score < 90 && score >= 80){
            grade = 'B';
        }else if (score < 80 && score >= 70){
            grade = 'C';
        }else if(score < 70 && score >= 60){
            grade = 'D';
        }else {
            grade = 'F';
        }

            System.out.println(grade);

            System.out.println("-------------------------");

            char grade2 = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

            System.out.println(grade2);


    }

}
/*
else if clause
it is used to make decision among several alternatives
   if(Condition1){
      Statements
    }else if (Condition2){
       Statements
    }else{
        Statements
    }

 Multiple 'else if' blocks can be given if needed
 */
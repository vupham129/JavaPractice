package day23_CustomMethods_Void;

public class Task5_GradeOfStudent {
    //5. create a method that can calculate the grade of the student based on the score

    public static void main(String[] args) {

        gradeOfStudent(59);

    }


    public static void gradeOfStudent(int score){
        if(score>=0&&score<=100){
            if(score>=90){
                System.out.println(score+ " is grade A");
            }else if(score>=80){
                System.out.println(score+" is grade B");
            }else if(score>=70){
                System.out.println(score+" is grade C");
            }else if(score>=60){
                System.out.println(score+" is grade D");
            }else{
                System.out.println(score+" is grade F");
            }

        }else{
            System.out.println(score+" is invalid score");
        }




    }



}

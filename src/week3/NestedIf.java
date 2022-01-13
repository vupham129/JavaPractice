package week3;

public class NestedIf {

    public static void main(String[] args) {
         int score = 90;

         if(score >= 0 && score <= 100){ // If score is valid
             if(score >= 60){
                 System.out.println("Passed");
             }else { // score < 60
                 System.out.println("Failed");
             }
         }else{ // if the score is not valid
             System.out.println("Invalid Score");
         }
    }
}
/*
used for creating a pre condition
if one condition can be evaluated to several alternatives
   if(Condition){
       if(Condition){
           Statements
       }
   }
  outer and inner if stmt can be any if statement (sibnle, else if, multi branch if )
 */
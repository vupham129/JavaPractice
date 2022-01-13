package snacks;

public class SchoolType {
    public static void main(String[] args) {
        byte grade = 15;
        boolean a = grade >= 1 && grade <= 5,
                b = grade >= 6 && grade <= 8,
                c = grade >= 9 && grade <= 12,
                d = grade >= 13 && grade <=16,
                e = grade >= 17 && grade <= 18;
        if(a){
            System.out.println("1-5: Elementary school");
        }
        if(b){
            System.out.println("6-8: Middle school");
        }
        if(c){
            System.out.println("9-12: High school");
        }
        if(d){
            System.out.println("13-16: College");
        }
        if(e){
            System.out.println("17-18: Grad School");
        }





    }
}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
 */
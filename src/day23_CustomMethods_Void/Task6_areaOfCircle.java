package day23_CustomMethods_Void;

public class Task6_areaOfCircle {
    //6. create a method that can calculate the area of a circle


    public static void main(String[] args) {
        areaOfCircle(2);
    }




    public static void areaOfCircle(int radius){
        double PI = 3.14;
        double areaOfCircle = PI*radius*radius;

        System.out.println("areaOfCircle = " + areaOfCircle);

    }





}

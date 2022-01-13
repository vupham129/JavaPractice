package day35_Encapsulation;

public class Circle {
    private double radius;
    public static double pi;

    public Circle(double radius) {
        setRadius(radius);
    }

    static{
        pi = 3.14;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius <= 0){
            System.err.println("Invalid entry: "+ radius);
            return;
        }

        this.radius = radius;
    }

    public double calcArea(){
        return radius*pi;
    }
    public double calcPerimeter(){
        return radius*pi*2;
    }

    public String toString() {
        return "Lunch{" +
                "radius=" + radius +
                "calcArea=" + calcArea() +
                "calcPerimeter=" + calcPerimeter() +
                '}';
    }

}
/*
2. Create a class named Circle

            privtae variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the raidus of coircle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()

 */

class CircleObjects{
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5);

        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());



    }
}
package day38_Inheritance.shapeTask;

public class Circle extends Shape {
    public static double pi = 3.14;
    public double radius;


    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*pi*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius='" + radius + '\'' +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}

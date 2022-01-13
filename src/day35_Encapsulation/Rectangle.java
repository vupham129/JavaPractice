package day35_Encapsulation;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
       setWidth(width);
       setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.exit(0);
        }
        this.length = length;
    }

    public double calcArea(){
        return width*length;
    }
    public double calcPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area of rectangle=" + calcArea() +
                ", perimeter of rectangle=" + calcPerimeter() +
                '}';
    }
}
/*
2. Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should be negative
							length of the rectangle should be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

 */

class RectangleObjects{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(2.5,-3.5);

        System.out.println(rec1);
    }
}
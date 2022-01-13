package day35_Encapsulation;

public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if(side<= 0){
            System.err.println("Invalid side: "+side);
        }
        this.side = side;
    }

    public double calcArea(){
        return side*side;
    }
    public double calcPerimeter(){
        return side*4;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "area of square=" + calcArea() +
                "perimeter of square=" + calcPerimeter() +
                '}';
    }
}
/*
1. Square Task:
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement
 */

class SquareObjects{
    public static void main(String[] args) {
        Square square1 = new Square(2.5);

        System.out.println(square1.calcArea());
        System.out.println(square1.calcPerimeter());

    }
}
package day33_Static;

public class Car {
    public String make, model, color;
    public int year;
    public double price;
    public static int numberOfWheels;
    public static boolean hasBattery;
    public static boolean hasSeats;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    static{
        numberOfWheels = 4;
        hasBattery = true;
        hasSeats = true;
    }

    public void drive(){
        System.out.println(make + " is driving");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
/*
7. Car Task:
		1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats

            Add a constructor to initialize all the fields

           Methods:
                drive()
                toString()
 */

class CarObjects{
    public static void main(String[] args) {

        Car car1 = new Car("Honda", "Civic", "Red", 2015, 20000);

        car1.drive();
        System.out.println(car1);


    }

}
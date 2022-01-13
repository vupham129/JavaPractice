package day34_GarbageCollection_AccessModifier;

public class Iphone {
    public static String brand;
    public String model, size, color;
    public double price;
    public String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

    public Iphone(String model, String size, String color, double price, String OS) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
        this.OS = OS;
    }

    static {
        brand = "Apple";
        isSmartPhone = true;
        madeIn = "China";
        designedIn = "USA";
    }

    public void printOperatingSystem(){
        System.out.println(model+"'s OS is: "+OS);
    }
    public void call(long phoneNumber){
        System.out.println(model+" has call function with phone number "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" has text function with phone number "+phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println(model+" has facetime function with phone number "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model+" has facetime function with email "+ email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS='" + OS + '\'' +
                '}';
    }
}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */
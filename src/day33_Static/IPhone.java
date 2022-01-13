package day33_Static;

public class IPhone {
    public String model;
    public double price;
    public String color;
    public String size;
    public static String brand = "Apple";
    public static boolean OS = true;
    public static String madeIn = "China";

    public IPhone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" : "+model+" : "+color+" : "+size+" has face time with phone number "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" : "+model+" : "+color+" : "+size+" has face time with email " + email);
    }
    public void call(long phoneNumber){
        System.out.println(brand+" : "+model+" : "+color+" : "+size+" has call function with phone number "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" : "+model+" : "+color+" : "+size+" has text function with phone number "+phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", OS='" + OS + '\'' +
                ", madeIn='" +madeIn + '\'' +
                '}';
    }
}
/*
4. IPhone Task:
		1. Create a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */

class IphoneObjects{
    public static void main(String[] args) {
        IPhone iph1 = new IPhone("XR",400,"red","Regular");
        iph1.faceTime(123456789);
        iph1.faceTime("daj@icloud.com");
        iph1.text(123456789);
        iph1.call(123456789);

        System.out.println(iph1);

    }
}




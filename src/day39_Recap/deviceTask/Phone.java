package day39_Recap.deviceTask;

public class Phone extends Device{
    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void call(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is calling with phone number "+phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is texting with phone number "+phoneNum);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price= $" + getPrice() +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}

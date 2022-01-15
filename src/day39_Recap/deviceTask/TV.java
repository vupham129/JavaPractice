package day39_Recap.deviceTask;

public class TV extends Device{
    public TV(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void remote(){
        System.out.println(getBrand()+" "+getModel()+ " has remote to control");
    }

    public void channelUp(){
        System.out.println(getBrand()+" "+getModel()+" has NBC channel up");
    }

    public void channelDown(){
        System.out.println(getBrand()+" "+getModel()+" has NBC channel down");
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price= $" + getPrice() +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}

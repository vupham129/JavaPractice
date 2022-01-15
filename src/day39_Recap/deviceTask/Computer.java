package day39_Recap.deviceTask;

public class Computer extends Device{
    public Computer(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void codeFunction(){
        System.out.println(getBrand()+" "+getModel()+" can download IntelliJ");
    }

    public void heavyGame(){
        System.out.println(getBrand()+" "+getModel()+ " can have more memories to contain games");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price= $" + getPrice() +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}

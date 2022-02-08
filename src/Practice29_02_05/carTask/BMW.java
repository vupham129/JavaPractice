package Practice29_02_05.carTask;

public class BMW extends Car{
    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" starts by press \"start\" button");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" has cruise control");
    }
}

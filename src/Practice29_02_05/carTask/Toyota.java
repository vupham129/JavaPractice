package Practice29_02_05.carTask;

public class Toyota extends Car{
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" starts the engine by twisting the key");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" has cruise control");
    }
}

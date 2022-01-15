package day39_Recap.deviceTask;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, double price) {
        super(brand, model, price);
    }
    public void hasCPU(){
        System.out.println(getBrand()+" "+getModel()+" has CPU");
    }

}

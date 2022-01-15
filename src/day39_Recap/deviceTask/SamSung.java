package day39_Recap.deviceTask;

public class SamSung extends Phone {
    public SamSung( String model, double price) {
        super("Sam Sung", model, price);
    }
    public void freeze(){
        System.out.println(getBrand()+" has freeze function");
    }


}

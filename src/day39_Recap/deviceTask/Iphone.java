package day39_Recap.deviceTask;

public class Iphone extends Phone{
    public Iphone( String model, double price) {
        super("Apple", model, price);
    }
    public void faceTime(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is calling facetime with phone number "+phoneNum);
    }
    public void faceTime(String email){
        System.out.println(getBrand()+" "+getModel()+" is calling facetime with email "+email);
    }

}

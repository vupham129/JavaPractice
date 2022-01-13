package day36_Inheritance.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone ip = new Iphone();
        ip.setInfo("Apple", "Iphone13", "Plus", 1399, "Pink");

        ip.call(123456789);
        ip.text(123456789);
        ip.faceTime(123456789);
        ip.faceTime("applebee@icloud.com");

        SamSung phone = new SamSung();
        phone.setInfo("Sam Sung", "galaxyS12", "Large", 1199, "Black");

        phone.call(987456123);
        phone.text(987456123);
        phone.freeze();
         // phone.faceTime(); // only iphone sub class

        Nokia phone1 = new Nokia();
        phone1.setInfo("Nokia", "N10", "Small", 899, "White");

        phone1.call(456789123);
        phone1.text(456789123);
        phone1.selfDefense();

        System.out.println(ip);

        System.out.println(phone);

        System.out.println(phone1);














    }

}

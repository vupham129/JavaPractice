package day31_Constructors;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet();
        carpet1.customOrder(10.5,8.5,13.50, false);

        Carpet carpet2 = new Carpet();
        carpet2.customOrder(9.5,5.5,14.50,true);

        System.out.println(carpet1);
        System.out.println(carpet2);

    }
}

package practiceTask_11_12_2021;

public class OxygenTank {
    public static void main(String[] args) {
        double tankLevel = 55.5;
        String result = "";

        if (tankLevel >= 90) {
            result = "Your tank is full";
        } else if (tankLevel >= 80) {
            result = "Still okay";
        } else if (tankLevel >= 70) {
            result = "Don't go too far";
        } else if (tankLevel >= 60) {
            result = "Start to head back";
        } else {
            result = "Be careful now you are at 50%";
        }
        System.out.println(result);

    }
}

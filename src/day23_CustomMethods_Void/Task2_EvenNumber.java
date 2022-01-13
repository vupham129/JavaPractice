package day23_CustomMethods_Void;

public class Task2_EvenNumber {
    // 2. create a method that can print even numbers between 1~100 in a same line saperated by space
     public static void main(String[] args) {

         evenNumber(1,100);

    }




    public static void evenNumber(int x, int y){
        for (int i = x; i <= y ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }



    }



}

package day24_CustomeMethods_Return;

public class LunchTask_UniqueElement {
//2. create a method that can display the unique elements of array
public static void main(String[] args) {

    String[] str = {"Java", "Java", "Python", "C#", "C#"};
    uniqueElements( str );


}






    public static void uniqueElements(String[] words){

        String result = "";

        for (String each : words) {
            int count = 0;
            for (String element : words) {
                if(element.equals(each)){
                    count++;
                }
            }
            if(count==1){
                result += each;

            }
        }

        System.out.println(result);



    }





}

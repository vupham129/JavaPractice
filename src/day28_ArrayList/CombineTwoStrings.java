package day28_ArrayList;

import java.util.ArrayList;

public class CombineTwoStrings {
    /*
    4. write a program that can combine two String arrays into one arrayList
	            ex: 
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("D");
        arr2.add("E");
        arr2.add("F");
        arr2.add("G");

        ArrayList<String> list = new ArrayList<>(arr1.size()+ arr2.size());

        for (String each : arr1) {
            list.add(each);

        }
        for (String each : arr2) {
            list.add(each);
        }

        System.out.println(list);












    }
}

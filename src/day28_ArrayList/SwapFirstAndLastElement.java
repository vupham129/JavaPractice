package day28_ArrayList;

import java.util.ArrayList;

public class SwapFirstAndLastElement {
    /*
    2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //always assign temp element to do swap element
        Integer temp = list.get(0);// assign a temporary element
        Integer firstElement = list.size(); // first element of new arraylist is assigned to the last index number of old array
        Integer lastElement = temp; // last element of new arrayList is assigned to the temp object
        list.set(0, firstElement);
        list.set(list.size()-1, temp );

        System.out.println(list);









    }
}

package day28_ArrayList;

import java.util.ArrayList;

public class FirstDuplicated {
    /*
    7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i) == list.get(j)){
                    count++;
                }
            }
            if(count>=2){
                System.out.println(list.get(i));
                break;
            }
        }












    }
}

package practiceTask_11_11_2021;

public class EqualNumbers {
    public static void main(String[] args) {
        double n1 = 46,
                n2 = 32,
                n3 = 45;
        String str = "";
        boolean result = n1 == n2 && n2 == n3 || n2 == n1 && n1 == n3; // if n1 == n2 == n3
        boolean result1 = n1 == n2 && n2 != n3 || n2 == n1 && n1 != n3; // if n1 == n2 and n2 not equal n3 or n2 == n1
        boolean result2 = n2 == n3 && n3 != n1 || n3 == n2 && n2 != n1; // if n2 == n3 and n3 not equal n1
        boolean result3 = n3 == n1 && n1 != n2 || n1 == n3 && n3 != n2; // if n3 == n1 and n1 not equal n2

        if(result){
            str = "all equal";
        }else if(result1){
           str = "\""+ n1+"&"+n2+" are equal";
        }else if(result2){
            str = "\""+ n2+"&"+n3+" are equal";
        }else if(result3){
            str = "\""+ n3+"&"+n1+" are equal";
        }else{
            str = "None of them are equal";
        }
        System.out.println(str);

        System.out.println("-----------------------------");


        int n4 = 100, n5 = 200, n6 = 200;

        String result4 = "";
        if(n4 == n5 && n5 == n6){
            result4 = "all equal";
        }else if(n4 == n5){
            result4 = "n4 & n5 are equal";
        }else if(n5 == n6){
            result4 = "n5 & n6 are equal";
        }else if(n4 == n6){
            result4 = "n4 & n6 are equal";
        }else{
            result4 = "none of them are equal";
        }

        System.out.println(result4);

    }
}
/*
6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */
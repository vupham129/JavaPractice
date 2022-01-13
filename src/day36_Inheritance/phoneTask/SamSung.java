package day36_Inheritance.phoneTask;

public class SamSung extends Phone{

    public void freeze(){
        System.out.println(brand+" "+model+" has freeze function");
    }



}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */
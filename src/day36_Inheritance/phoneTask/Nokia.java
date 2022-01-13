package day36_Inheritance.phoneTask;

public class Nokia extends Phone{

    public void selfDefense(){
        System.out.println(brand+" "+model+" has self defense function");
    }


}
/*
1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */
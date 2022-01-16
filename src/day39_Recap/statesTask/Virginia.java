package day39_Recap.statesTask;

public class Virginia extends States  {


    public Virginia( String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        super("Virginia", abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void snow(){
        System.out.println(getName()+" is snowing in the winter");
    }

    public void hasBlueRidgeMountain(){
        System.out.println(getName()+" ");
    }



}

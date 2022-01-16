package day39_Recap.statesTask;

public class Texas extends States{

    public Texas( String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        super("Texas", abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void floodWater(){
        System.out.println(getName()+" has flood water");
    }

    public void bigger(){
        System.out.println("Everything is bigger in "+getName());
    }



}

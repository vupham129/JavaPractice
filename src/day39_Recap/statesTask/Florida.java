package day39_Recap.statesTask;

public class Florida extends States{

    public Florida( String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        super("Florida", abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void humid(){
        System.out.println(getName()+" is humidity");
    }

    public void MexicanGulf(){
        System.out.println(getName()+" has Mexican Gulf city");
    }




}

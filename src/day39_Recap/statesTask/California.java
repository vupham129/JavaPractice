package day39_Recap.statesTask;

public class California extends States{

    public California( String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        super("California", abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void pacificOcean(){
        System.out.println(getName() +" is on Pacific Ocean");
    }

    public void hasHollywood(){
        System.out.println(getName()+" has Hollywood sign");
    }

    public void climate(){
        System.out.println(getName()+" is dry heat");
    }



}

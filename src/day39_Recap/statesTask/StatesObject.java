package day39_Recap.statesTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StatesObject {
    public static void main(String[] args) {

        Virginia va = new Virginia("VA", "Republican", "Glenn Youngkin", "Mark Warner", 8.536, 5.3);

        California ca = new California("CA", "Democrat", "Gavin Newsom", "Alex Padilla", 39.51, 13);

        Texas tx = new Texas("TX", "Republican", "Greg Abbot", "Ted Cruz", 29.1, 7.6);

        Florida fl = new Florida("FL", "Republican", "Ron Desantis", "Marco Rubio", 21.9, 0 );

        System.out.println(va);
        System.out.println(ca);
        System.out.println(tx);
        System.out.println(fl);

        System.out.println("==============================");

        va.snow();
        va.hasBlueRidgeMountain();
        System.out.println("==============================");

        ca.climate();
        ca.hasHollywood();
        ca.pacificOcean();
        System.out.println("==============================");

        tx.bigger();
        tx.floodWater();
        System.out.println("==============================");

        fl.humid();
        fl.MexicanGulf();

        // count how many states follow Republican and Democrat

        ArrayList<States> statesList = new ArrayList<>(Arrays.asList(va, ca, tx, fl));

        int countRep =0;
        int countDemo = 0;
        for (States states : statesList) {
            if(states.getPoliticalParty().equals("Republican")){
                countRep++;
            }
            if(states.getPoliticalParty().equals("Democrat")){
                countDemo++;
            }
        }

        System.out.println("countRep = " + countRep);

        System.out.println("countDemo = " + countDemo);

        // remove the state that do not follow Republican

        statesList.removeIf(p -> p.getPoliticalParty().equals("Democrat"));


        // print out the name of the state that follow Republican

        for (States states : statesList) {
            System.out.println(states.getName());
        }



    }
}
/*
3. Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes
 */
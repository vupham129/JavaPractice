package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {

    public static boolean isWild, isFriendly, isPlayable;

    static{
        isWild = false;
        isFriendly = true;
        isPlayable = false;
    }

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void play(){
        System.out.println(getName()+" is playing");
    }

    public void pet(){
        System.out.println(getName()+" is petting");
    }
}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */
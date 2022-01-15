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

    @Override
    public String toString() {
        return "Friendly Animal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", is Friendly='" + isFriendly + '\'' +
                ", is Wild='" + isWild+ '\'' +
                '}';
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
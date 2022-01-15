package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void fly(){
        System.out.println(getName()+" "+getBreed()+" is flying");
    }
    public void sing(){
        System.out.println(getName()+" "+getBreed()+" is singing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+getBreed()+" is eating bugs");
    }


}

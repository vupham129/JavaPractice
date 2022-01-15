package day39_Recap.animalTask;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void scratch(){
        System.out.println(getName()+" "+getBreed()+" is scratching");
    }
    public void meow(){
        System.out.println(getName()+" "+getBreed()+" is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+getBreed()+" is eating cat food");
    }

}

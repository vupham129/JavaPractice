package day39_Recap.animalTask;

public class Lion extends WildAnimal{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting deer");
    }
    public void roar(){
        System.out.println(getName()+" is roaring");
    }
    
}

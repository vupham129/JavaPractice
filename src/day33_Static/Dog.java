package day33_Static;

public class Dog {
    public String name;
    public String breed, size, color;
    public char gender;
    public int age;
    public static int numberOfLegs  = 4;
    public static int numberOfEyes = 2;
    public static int numberOfWings = 0;
    public static boolean isFriendly = true;

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void play(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", numberOfLegs=" + numberOfLegs +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfWings=" + numberOfWings +
                ", isFriendly=" + isFriendly+
                '}';
    }
}
/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()

 */

class DogObjects{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucy", "Husky", "Big", "Black and white", 'F', 7);
        dog1.eat();

        System.out.println(dog1);


    }
}
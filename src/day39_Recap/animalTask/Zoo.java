package day39_Recap.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "Husky", 'M', 2, "Medium", "Black and White");

        Cat cat = new Cat("Marlow", "Exotic Shorthair", 'F', 4, "Small", "Grey");

        Dolphin dolphin = new Dolphin("Susan", "Mamalia", 'M', 25, "Small", "White");

        Parrot parrot = new Parrot("Coco", "Cockcotoos", 'M', 2, "Small", "Yellow and White");

        Lion lion = new Lion("Leo", "African Lion", 'M', 20, "Medium", "Brown");

        Tiger tiger = new Tiger("Tigery", "Bengal", 'F', 23, "Medium", "Black and White and Yellow");

        Eagle eagle = new Eagle("Eagly", "Eastern Imperial", 'F', 32, "Large", "Golden");

        Bear bear = new Bear("Pooh", "Asiatic", 'F', 43, "Large", "Black");

        Python python = new Python("Nana", "Ball", 'F', 26, "Long", "Black and White");

        Crocodile crocodile = new Crocodile("Croco", "Nile", 'M', 20, "Large", "Dark Gray");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(dolphin);
        System.out.println(parrot);
        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println(bear);
        System.out.println(python);
        System.out.println(crocodile);

        System.out.println("======================================");

        dog.eat();
        dog.drink();
        dog.bark();

        tiger.hunt();
        tiger.eat();










    }
}

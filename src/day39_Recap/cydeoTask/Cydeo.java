package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester = new Tester("Enes", 35, 'M', 15, 115000);

        Developer dev = new Developer("Hulya", 28, 'F', 20, 130000);

        Teacher teacher = new Teacher("Muhtar", 36, 'M', 65, 150000);

        Student student1 = new Student("Anna", 30, 'F', 101, "SDET");

        tester.work();
        tester.createTicket();
        tester.drink();
        tester.eat();
        tester.sleep();

        dev.work();
        dev.fixingBugs();
        dev.sleep();
        dev.eat();
        dev.drink();

        teacher.work();
        teacher.eat();
        teacher.drink();
        teacher.sleep();

        student1.study();
        student1.eat();
        student1.drink();
        student1.sleep();

        System.out.println(tester);
        System.out.println(dev);
        System.out.println(teacher);
        System.out.println(student1);
    }
}

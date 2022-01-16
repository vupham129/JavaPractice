package day39_Recap.studentTask;

public class StudentObjects {
    public static void main(String[] args) {

        GraduateStudent grad = new GraduateStudent("Enes", 32, 'M', 1234, "Business", 'B', "EastBay Hayward" );

        UndergraduateStudent undergrad = new UndergraduateStudent("Hulya", 23, 'F' , 123 , "Medical and Health", 'A', "UC David");

        CydeoStudent stu = new CydeoStudent("Anna", 26, 'F', 45623, "Engineer", 'B', 25, 14, "Java");

        System.out.println(grad);
        System.out.println(undergrad);
        System.out.println(stu);

        System.out.println("===========================");

        grad.study();
        grad.eat();
        grad.drink();
        grad.sleep();

        System.out.println("==================================");

        undergrad.study();
        undergrad.eat();
        undergrad.drink();
        undergrad.sleep();

        System.out.println("==================================");

        stu.study();
        stu.eat();
        stu.drink();
        stu.sleep();


















    }
}

package day33_Static;

public class CydeoStudentObjects {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Anna", 26, 'F', 13, 'B', "B25", 14);
        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();

        System.out.println(student1);


    }
}

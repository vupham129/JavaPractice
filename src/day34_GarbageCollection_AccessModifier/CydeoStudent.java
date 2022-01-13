package day34_GarbageCollection_AccessModifier;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public static String batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    static {
        batchNumber = "B25";
        schoolName = "Cydeo School";
        fieldOfStudy = "SDET";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }
    public static void printSchoolName(){
        System.out.println("School name is: "+schoolName);
    }
    public static void printSecretCode(){
        System.out.println("Secret code is: "+secretCode);
    }
    public void attendClass(){
        System.out.println(name+ " is attending class");
    }
    public void study(){
        System.out.println(name+ " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
 2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */

class Test{
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Aygun", 'F', 35, 15);
        CydeoStudent.printSchoolName();
        CydeoStudent.printSecretCode();
        student1.study();
        student1.attendClass();
        System.out.println(student1);


    }
}
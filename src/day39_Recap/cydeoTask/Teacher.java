package day39_Recap.cydeoTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Teacher", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is teaching");
    }
}

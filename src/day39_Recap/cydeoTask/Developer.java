package day39_Recap.cydeoTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is coding");
    }
    public void fixingBugs(){
        System.out.println(getName()+ " is fixing bugs");
    }

}

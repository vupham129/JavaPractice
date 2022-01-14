package day39_Recap.cydeoTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing");
    }

    public void createTicket(){
        System.out.println(getName()+" is creating tickets");
    }


}

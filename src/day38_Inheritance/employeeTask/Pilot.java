package day38_Inheritance.employeeTask;

public class Pilot extends Employee{
    public Pilot(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Pilot", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name+" is working for taking off the airplane");
    }
    public void landing(){
        System.out.println(name+" is working for landing the airplane");
    }

}

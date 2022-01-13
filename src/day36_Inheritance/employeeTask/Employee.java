package day36_Inheritance.employeeTask;

public class Employee {
    public String name;
    public char gender;
    public int age;
    public String jobTitle;
    public int id;
    public double salary;


    public void setInfo(String name, char gender, int age, String jobTitle, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;

    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*
Employee:
		name, gender, age, jobTitle, id, salary, companyName
		work(), toString()


 */
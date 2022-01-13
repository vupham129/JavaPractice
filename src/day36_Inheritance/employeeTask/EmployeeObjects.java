package day36_Inheritance.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.setInfo("Aygun", 'F', 30, "SDET", 15, 115000);
        tester.work();
        tester.testing();
        tester.creatingTicket();

        Developer dev = new Developer();
        dev.setInfo("Ahmet", 'M', 35, "Software Engineer", 19, 125000);
        dev.work();
        dev.coding();
        dev.fixingBugs();

        Driver driver = new Driver();
        driver.setInfo("Alex", 'M', 40, "Uber Driver", 65, 45000);
        driver.work();
        driver.drivering();

        Teacher teacher = new Teacher();
        teacher.setInfo("Ana", 'F', 45, "Math Teacher", 87, 95000);
        teacher.work();
        teacher.teaching();

        System.out.println(tester);
        System.out.println(dev);
        System.out.println(driver);
        System.out.println(teacher);

    }
}

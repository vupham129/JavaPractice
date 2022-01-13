package day31_Constructors;

public class SalaryCalculator {
    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double stateTax(){
        return (stateTaxRate/100)*salary();
    }
    public double federalTax(){
        return (federalTaxRate/100)*salary();
    }
    public double salaryAfterTax(){
        double result = salary() - stateTax() - federalTax();
        return result;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */

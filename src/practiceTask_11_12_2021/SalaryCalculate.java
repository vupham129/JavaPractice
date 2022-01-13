package practiceTask_11_12_2021;


public class SalaryCalculate {
    public static void main(String[] args) {
        double taxRate, salaryAfterTax;
        int salary = 129000;
        boolean isMarried = false;

        if(salary >= 130000){
            if(isMarried){
                salaryAfterTax = salary - salary*0.3; // (35- 5)/100
            }else{
                salaryAfterTax = salary - salary*0.35; // if not married, 35/100
            }
        }else if(salary >= 100000){
            if(isMarried){
                salaryAfterTax = salary - salary*0.25; // (30 - 5)/100
            }else{
                salaryAfterTax = salary - salary*0.3; // if not married 30/100
            }
        }else if(salary >= 80000){
            if(isMarried){
                salaryAfterTax = salary - salary*0.2; // (25 - 5)/100
            }else{
                salaryAfterTax = salary - salary*0.25; // not married 25/100
            }
        }else{
            if(isMarried){
                salaryAfterTax = salary - salary*0.15; // (20 - 5)/100
            }else{
                salaryAfterTax = salary - salary*0.2; // not married 20/100
            }
        }
        System.out.println("salaryAfterTax = " + salaryAfterTax);

    }
}
/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */
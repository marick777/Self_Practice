package day17_ClassAndObjects;

public class TestSalaryCalculator {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator();
        salary1.setInfo(55,45,7.5,24.5);
        SalaryCalculator salary2 = new SalaryCalculator();
        salary2.setInfo(60.5,40,5.5,19.8);
        SalaryCalculator salary3 = new SalaryCalculator();
        salary3.setInfo(44,55,6.3,20.8);


        System.out.println(salary1);
        System.out.println(salary2);
        System.out.println(salary3);
        System.out.println();
        salary1.salary();
        salary1.federalTax();
        salary1.stateTax();
        salary1.salaryAfterTax();
    }
}

package day06_ifStatement;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary =  100000;
        boolean isMarried = true;


        if (salary >= 130000 && isMarried) {
            System.out.println("Salary after tax: $" + (salary - (salary * 30 / 100)));
        }
        if (salary >= 130000 && !isMarried) {
            System.out.println("Salary after tax: $" + (salary - (salary * 35 / 100)));
        }
        if (salary >= 100000 && salary <= 129000 && isMarried) {
            System.out.println("Salary after tax: $" + (salary - (salary * 25 / 100)));
        }
        if (salary >= 100000 && salary <= 129000 && !isMarried) {
            System.out.println("Salary after tax: $" + (salary - (salary * 30 / 100)));
        }
        if (salary >= 80000 && salary <= 99000 && isMarried) {
            System.out.println("Salary after tax: $" + (salary - (salary * 20 / 100)));
        }
        if (salary >= 80000 && salary <= 99000 && !isMarried) {
            System.out.println("Salary after tax: $" + (salary - (salary * 25 / 100)));
        }
        if (salary <= 79000 && isMarried) {
            System.out.println("Salary after tax: $" + (salary - (salary * 15 / 100)));
        }
        if (salary <= 79000 && !isMarried) {
            System.out.println("Salary after tax: $" + (salary - (salary * 20 / 100)));
        }


        }
    }
/*
9. Create a class named NetIncomeCalc,
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */
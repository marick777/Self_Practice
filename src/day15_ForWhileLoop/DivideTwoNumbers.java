package day15_ForWhileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        System.out.println("Enter first positive numbers:");
        num1 = input.nextInt();
        System.out.println("Enter second positive number:");
        num2 = input.nextInt();


        if ((num1 != 0 && num2 != 0) && (num1 > 0 && num2 > 0)) {
            while (num1 >= num2) {
                num1 -= num2;
                result++;

            }
            System.out.println("Result: " + result+" remainder "+num1);

        } else {
            System.err.println("You entered "+num2+"\nRe-enter two positive numbers");

        }
        input.close();



    }
}
/*
Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.
 */
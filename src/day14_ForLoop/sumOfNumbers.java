package day14_ForLoop;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter second number: ");
        int n2 = input.nextInt();
        input.close();

        int sum = 0;

        // sum of all numbers 1 ~ 100


        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println("Sum of "+n1+" and "+n2+" = "+sum);

    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */

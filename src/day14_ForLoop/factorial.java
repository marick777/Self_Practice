package day14_ForLoop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = input.nextInt();
        input.close();

        double factorial = 1;


        for (int i = 2; i <= num ; i++) {
            //System.out.print(i);
            factorial *= i;


        }
        System.out.print("Factorial "+num+" = "+factorial);


    }

}

/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
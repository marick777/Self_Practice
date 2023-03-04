package day15_ForWhileLoop;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            int number = input.nextInt();

            if (number > 0 && number < 2147483647) {
                positive = positive+1;
            } else if (number < 0 && number > -2147483648) {
                negative = negative+1;
            } else {
                //System.out.println("You entered 0");

            }


        }
        System.out.println(positive + " positive and " + negative + " negative");
        input.close();


    }

}
/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
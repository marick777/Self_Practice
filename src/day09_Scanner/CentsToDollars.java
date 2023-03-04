package day09_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents amount: ");
        int cents = input.nextInt();
        input.close();

        int dollar = cents/100;
        int restCents = cents%100;

        System.out.println(cents+" cents equal to: "+dollar+" dollars and "+restCents+" cents.");



    }
}
/*
5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */
package day09_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many total shares you have already?");
        int totalShares = input.nextInt();

        double totalValue = 0;
        String company = null;
        if (totalShares > 0) {
            System.out.println("How much your total value in stock market is");
            totalValue = input.nextDouble();
            input.nextLine();
            System.out.println("Enter he name of the company they have the most shares in");
            company = input.nextLine();
            System.out.println("Your total stock market holding is $" + totalValue + " which is made up of " + totalShares + " shares. " + company + " is your company holdings");

        } else {
            System.out.println("You dont have shares");
        }



    }
}
/*
Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */
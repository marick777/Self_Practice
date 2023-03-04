package day11_String;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = input.next();

        System.out.println("Enter last name:");
        String lastName = input.next();
        input.close();

        firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);


    }
}
/*
Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
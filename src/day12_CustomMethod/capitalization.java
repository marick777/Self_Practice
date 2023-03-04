package day12_CustomMethod;

import java.util.Scanner;

public class capitalization {
    public static void main(String[] args) {

        capitalization();


    }

    public static void capitalization(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = input.next().trim().replace(" ", "");
        System.out.println("Enter last name: ");
        String lastName = input.next().trim().replace(" ", "");

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName+" "+lastName;

        System.out.println("fullName = " + fullName);


    }
}
/*
Create a method named capitalization that can format the
first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */
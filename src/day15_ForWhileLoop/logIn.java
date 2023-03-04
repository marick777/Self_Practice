package day15_ForWhileLoop;

import java.util.Scanner;

public class logIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username = "Cydeo";
        String password = "Cydeo123";
        String inputUsername = "";
        String inputPassword = "";
        int attempt = 3;

        System.out.println("Enter username:");
        inputUsername = input.next();
        System.out.println("Enter password:");
        inputPassword = input.next();

        if (username.equals(inputUsername)&&password.equals(inputPassword)) {
            System.out.println("Logged in");

        }else {
            System.out.println("Incorrect username or password\nTry again");

            //if (!username.equals(inputUsername) || !password.equals(inputPassword)) {


                for (int i = 1; i < 4; i++) {
                    System.out.println("Enter username:");
                    inputUsername = input.next();
                    System.out.println("Enter password:");
                    inputPassword = input.next();
                    if (username.equals(inputUsername) && password.equals(inputPassword)) {
                        System.out.println("Logged in");
                        break;

                    } else {
                        --attempt;
                        System.out.println("Incorrect username or password\n"+attempt+" attempts left");
                    }
                     if (attempt==0){
                         System.err.println("Your account locked");


                    }



                }


            }
        }}

/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to
                enter correct credentials and if all three attempts are failed, then print "Your account is lucked
 */

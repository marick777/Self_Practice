package day15_ForWhileLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = input.nextLine().toLowerCase();
        System.out.println("Enter a char:");
        char chr = input.next().charAt(0);

                int frequency = 0;
        input.close();

        for (int i = 0; i < str.length(); i++) {

         if (str.charAt(i)==chr){
                frequency +=1;
            }

        }

        System.out.println(frequency);
    }
}
/*
Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
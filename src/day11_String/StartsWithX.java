package day11_String;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.next();
        input.close();

        word = word.substring(0,1).toLowerCase().replace("x", "a")+word.substring(1, word.length());

        System.out.println(word);



    }
}
/*
Create a class named StartsWithX and write a program that asks user to enter a word.
If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
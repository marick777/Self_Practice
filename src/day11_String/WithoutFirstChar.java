package day11_String;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.next();

        System.out.println("Enter second word: ");
        String secondWord = input.next();
        input.close();

        firstWord = firstWord.substring(1, firstWord.length());
        secondWord = secondWord.substring(1, secondWord.length());

        System.out.println(firstWord+secondWord);


    }
}
/*
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */
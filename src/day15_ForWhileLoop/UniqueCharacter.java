package day15_ForWhileLoop;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {


       // Scanner input = new Scanner(System.in);

       // String word = input.next();

        String word = "AABCCD";
        String result = "";

        for (int i = 0; i < word.length(); i++) {

            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))){
                result += word.charAt(i);

            }


        }
        System.out.println(result);

    }
}
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */
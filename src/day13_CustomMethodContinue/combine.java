package day13_CustomMethodContinue;

import java.util.Scanner;

public class combine {
    public static void main(String[] args) {

        combine();



    }

    public static void combine(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.next();

        System.out.println("Enter second word: ");
        String secondWord = input.next();
        input.close();



        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)){
            System.out.println(firstWord+secondWord.substring(1));
        }else {
            System.out.println(firstWord+secondWord);
        }



    }

}

/*
Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same,
        return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
 */
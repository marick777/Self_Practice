package day14_ForLoop;

import java.util.Scanner;

public class retrieve {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you data: ");
        String data = input.next();
        input.close();

        String letters = "", digits = "", specialCharacter = "";

        for (int i = 0; i < data.length(); i++) {


            if (data.charAt(i) >= 65 && data.charAt(i) <= 90 || data.charAt(i) >= 97 && data.charAt(i) <= 122) {
                letters += data.charAt(i);
            } else if (data.charAt(i) >= 48 && data.charAt(i) <= 57) {
                digits += data.charAt(i);
            } else {
                specialCharacter += "" + data.charAt(i);
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacter = " + specialCharacter);
    }
}
/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
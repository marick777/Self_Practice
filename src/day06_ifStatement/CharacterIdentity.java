package day06_ifStatement;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '@';
        String result = "";

        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
            result = (ch + " --- Alphabetic Character(A~Z or a~z)");
        }
        if (ch >= 48 && ch <= 57) {
            result = (ch + " --- Digital Character(0~9)");
        }
        if (ch >= 32 && ch <= 46 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 127) {
            result = (ch + " --- Special Character");
        }

        System.out.println(result);


    }
}
/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character
is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chacters on ASCII table
 */
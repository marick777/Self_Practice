package day16_DoWhileLoop;

import java.util.Scanner;

public class frequencyOfChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = input.nextLine().toLowerCase();


        input.close();

        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char chr = str.charAt(j);

            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {


                if (str.charAt(i) == chr) {
                    frequency += 1;


                }

            }
            if (result.contains("" + chr)) {
                continue;
            }
                result += "" + chr + frequency;

            }
            System.out.println(result);

        }


    }


/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */
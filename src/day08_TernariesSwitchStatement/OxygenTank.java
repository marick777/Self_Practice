package day08_TernariesSwitchStatement;

public class OxygenTank {
    public static void main(String[] args) {

        int number = 75;

        String level = (number>=0&&number<=100)?
                (number>=90&&number<=100)?"Your tank is full":
                (number>=80&&number<90)?"Still okay":
                (number>=70&&number<90)?"Don't go too fare":
                (number>=60&&number<70)?"Start to head back":
                "Be careful now you at 50%":"Invalid Level";

        System.out.println(level);


    }
}
/*
4. Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
 */
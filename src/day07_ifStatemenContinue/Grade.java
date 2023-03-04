package day07_ifStatemenContinue;

public class Grade {

    public static void main(String[] args) {

        char grade = 'F';

        String result = "";

        if (grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F') {

            if (grade == 'A') {
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Greate Job";
            } else if (grade == 'C') {
                result = "Good";
            } else if (grade == 'D') {
                result = "Passed";
            } else {
                result = "Failed";
            }

            System.out.println(result);
        }else{
            System.err.println("Invalid grade");
        }

    }
}
/*
4. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
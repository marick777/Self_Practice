package day09_Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double n1 = input.nextDouble();

        System.out.println("Enter math operator: ");
        char matOp = input.next().charAt(0);

        System.out.println("Enter second number: ");
        double n2 = input.nextDouble();

        input.close();


        if(matOp== '+' || matOp== '-' || matOp =='*' || matOp=='/'){

            if(matOp=='+'){
                System.out.println("Resul = "+(n1+n2));
            } else if (matOp=='-') {
                System.out.println("Result = "+(n1-n2));
            } else if (matOp=='*') {
                System.out.println("Result = "+(n1*n2));
            }else {
                System.out.println("Result = "+(n1/n2));
            }

        }else{
            System.out.println("Invalid Entry");
        }

        }

    }


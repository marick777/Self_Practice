package day15_ForWhileLoop;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;
        int result = 0;

        while(true){
            System.out.println("Enter positive number to calculate sum:");
            num = input.nextInt();
            if(num<0) break;
            result +=num;
        }
        System.out.println("Sum of entered numbers: "+result);
        input.close();
    }
}

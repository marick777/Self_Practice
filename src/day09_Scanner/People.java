package day09_Scanner;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class People {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people live with you?");
        int num = input.nextInt();

        String result = (num<3)?"Live with less than 3 people":(num<=3&&num<=6)?"Live with 3 - 6 people"
                :"Live with more than 6 people";
        input.close();

        System.out.println(result);
    }


}

/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */
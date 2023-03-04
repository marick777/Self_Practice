package day15_ForWhileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String yesOrNo = "";
        String roomType = "";
        String options = "King Bed ==> $120\n" +
                "Queen Bed ==> $100\n" +
                "Single Bed ==> $80";

        System.out.println("Do you want to reserve a room?");
        yesOrNo = input.next().toLowerCase();

        while (!yesOrNo.equals("yes") && !yesOrNo.equals("no")) {
            System.out.println(" Invalid answer. Do you still want to reserve a room?");
            yesOrNo = input.next().toLowerCase();

        }


        //input.nextLine();
        if (yesOrNo.equals("yes")) {
            System.out.println("We have this options:\n\n" + options + "\n\nSelect your room: ");
            roomType = input.nextLine().toLowerCase();


            while (!roomType.equals("king bed") && !roomType.equals("queen bed") && !roomType.equals("single bed")) {
                System.out.println("You selected invalid room.\n"+options+"\nReselect the room:");
                roomType = input.nextLine().toLowerCase();
            }

            if (roomType.equals("king bed")) {
                roomType = "King Bed ==> $120";
            } else if (roomType.equals("queen bed")) {
                roomType = "Queen Bed ==> $100";
            } else/* (roomType.equals("single bed"))*/ {
                roomType = "Single Bed ==> $80";
            }
                System.out.println("You selected: " + roomType);

            } else {
                System.out.println("Have a nice day");
            }

            input.close();


        }
    }
/*
Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to
reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no,
    	print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user
    			provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */

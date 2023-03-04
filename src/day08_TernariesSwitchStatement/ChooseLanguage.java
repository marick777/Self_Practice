package day08_TernariesSwitchStatement;

public class ChooseLanguage {
    public static void main(String[] args) {

        int number = 4;

        System.out.println("----------------------------------Ternery Solution---------------------------------------");

        String language1 = (number>=1&&number<=5)?
                (number==1)?"Hello, thank for your call":
                (number==2)?"Hola, gracias para llamar":
                (number==3)?"Merhaba, aradiginiz icin tesekkurler":
                (number==4)?"Privet, spasibo za vash zvonok":
                "Merci, pour votre appel":
                "Invalid Number";
        System.out.println(language1);

        System.out.println("----------------------------------Switch Statement---------------------------------------");

        String language2 = "";

                switch (number){
                    case 1:
                        System.out.println("Hello, thank for your call");
                        break;
                    case 2:
                        System.out.println("Hola, gracias para llamar");
                        break;
                    case 3:
                        System.out.println("Merhaba, aradiginiz icin tesekkurler");
                        break;
                    case 4:
                        System.out.println("Privet, spasibo za vash zvonok");
                        break;
                    case 5:
                        System.out.println("Merci, pour votre appel");
                        break;
                    default:
                        System.out.println("Invalid Number");
                }


    }
}
/*
5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given
 		in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */
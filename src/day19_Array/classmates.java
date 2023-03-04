package day19_Array;

import java.util.Arrays;

public class classmates {
    public static void main(String[] args) {

        String[] classMates = {"Ahmad Kiomarz", "Aidai Chokoeva", "Aihemaiti Pahaerding", "Lilia Popova",
                "Long Mau Nguyen", "Vitalii Anchakivskyi", "Anna Hnatiuk", "Iuri Pulucciu", "Ivanna Kravtsiv"};

        String result = "";

        for (int i = 0; i < classMates.length; i++) {
            result = "" + classMates[i].charAt(0) + ". " + classMates[i].charAt(classMates[i].lastIndexOf(" ") + 1)+".";
            System.out.println(result);
        }


    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate in separate lines
 */

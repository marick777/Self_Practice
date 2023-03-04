package day19_Array;

public class ReverseClassmates {
    public static void main(String[] args) {

        String[] classMates = {"Ahmad Kiomarz", "Aidai Chokoeva", "Aihemaiti Pahaerding", "Lilia Popova",
                "Long Mau Nguyen", "Vitalii Anchakivskyi", "Anna Hnatiuk", "Iuri Pulucciu", "Ivanna Kravtsiv"};
/*
        for (int i = classMates.length - 1; i >= 0; i--) {
            System.out.println(classMates[i]);
        }
*/
        for (int i = 0; i < classMates.length; i++) {
            String reverse = "";
            for (int j = classMates[i].length()-1; j >=0 ; j--) {
                reverse += classMates[i].charAt(j);
            }
            System.out.println(reverse);
        }

    }
}
/*
create string array, and store the names of your  classmates (10)
            reverse each student names and print them in separate line
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */

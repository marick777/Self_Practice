package day41_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class employee {
    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        int max = Collections.max(map.values());
        int min = Collections.min(map.values());


        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            if(eachEntry.getValue() == max){
                System.out.println(eachEntry.getKey() +" max salary "+ eachEntry.getValue());
            }

            if
                (eachEntry.getValue() == min){
                 System.out.println(eachEntry.getKey() +" min salary "+ eachEntry.getValue());
                }
            }







    }
}



/*
2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */


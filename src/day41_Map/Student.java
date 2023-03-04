package day41_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {


        Map<String, Integer> studentsMap = new LinkedHashMap<>();
        studentsMap.put("Lilia", 100);
        studentsMap.put("Paha", 99);
        studentsMap.put("Anch", 98);
        studentsMap.put("Long", 97);
        studentsMap.put("Nick", 96);

        for (Map.Entry<String, Integer> eachSet : studentsMap.entrySet()) {
            System.out.println(eachSet);
        }


    }
}
/*
Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student
has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */

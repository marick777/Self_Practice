package day18_GarbageCollection;

public class highestFrequency {
    public static void main(String[] args) {

        String str = "aaabbccccddeeee";
        String result = "";
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    count++;
                }

            }
            if (count>=max&& !(result.contains(""+ch))){
                if (count>max){
                    max = count;
                    result = ch + "\n";
                }else{
                    max = count;
                    result += ch + "\n";
                }
            }



        }

        System.out.println(result);



        }



    }

/*
Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */

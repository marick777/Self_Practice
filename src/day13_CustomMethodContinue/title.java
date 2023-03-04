package day13_CustomMethodContinue;

public class title {
    public static void main(String[] args) {

        title("jAvA");



    }

    public static void title(String word){

        String wordNew = "";

        wordNew = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();

        System.out.println("title (\""+word+"\") ===> "+wordNew);




    }



}
/*
Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

 */
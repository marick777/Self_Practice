package day13_CustomMethodContinue;

public class FrequencyOfWord {
    public static void main(String[] args) {

frequencyOfWord("asidjdiadjaoidaoijdaosijd Jaca kdsjalkjsakj kasjdlaklkasJava java java gdgdghdjdjs java", "Java");

    }

    public static void frequencyOfWord(String sentence, String word ){

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int lengthOfWord = word.length();
        int lengthOfSentence = sentence.length();

        String sentenceAfterReplace = sentence.replace(word,"");
        int lengthOfSentenceAfterReplace = sentenceAfterReplace.length();
        int difference = lengthOfSentence - lengthOfSentenceAfterReplace;
        int frequency = difference/lengthOfWord;

        System.out.println(frequency);


    }
}
/*
Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */
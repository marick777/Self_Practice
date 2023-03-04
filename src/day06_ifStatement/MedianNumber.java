package day06_ifStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;
        String result = "";

        if (a<b && b<c || a>b && b>c){
            result = b+" is themedian number";
        }
        if (a<c && c<b || a>c && c>b){
            result = c+" is the median number";
        }
        if (b<a && a<c || b>a && a>c){
            result = a+" is the median number";
        }

        System.out.println(result);


    }
}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
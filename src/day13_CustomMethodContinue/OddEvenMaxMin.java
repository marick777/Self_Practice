package day13_CustomMethodContinue;

public class OddEvenMaxMin {
    public static void main(String[] args) {

        System.out.println(isEven(3));
        System.out.println(isOdd(3));
        System.out.println(max(3,5));
        System.out.println(min(14,22));


    }

    public static boolean isOdd(int num) {
        //return (num%2!=0)? true:false;
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int num){
        //return !isOdd(num);
        return (num%2==0)?true:false;
    }

    public static int max(int n1, int n2){
        if (n1>n2){
            return n1;
        }else{
            return n2;
        }

    }

    public static int min(int n1, int n2){

        if (n1<n2){
            return n1;
        }else {
            return n2;
        }
    }




}
/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */


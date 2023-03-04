package day07_ifStatemenContinue;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 0;
        String result="";

        if (age>0&&age<21||age>=21&&age<=55||age>=56&&age<=150){
            if (age>0&&age<21)
                result ="Teenager";
            else if (age>=21&&age<55)
                result = "Adult";
            else
                result = "Senior";
            System.out.println(result);

            }else{
            System.err.println("Invalid age");
        }
    }
}

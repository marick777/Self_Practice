package day12_CustomMethod;

public class emailDomain {
    public static void main(String[] args) {
        email("cydeo@gmail.com");


    }

    public static void email(String email){
        System.out.println("domain: "+email.substring(email.indexOf('@')+1, email.indexOf('.')));




    }



}

/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */

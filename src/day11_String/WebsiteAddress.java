package day11_String;

public class WebsiteAddress {
    public static void main(String[] args) {

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.") && url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov");

        if(isValid){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }


    }
}
/*
Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */
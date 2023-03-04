package day07_ifStatemenContinue;

public class Browser {

    public static void main(String[] args) {

        String browserName = "IE";
        String result ="";

        if (browserName=="chrome"||browserName=="firefox"||browserName=="opera"||browserName=="safari"||browserName=="edge"){
            if (browserName=="chrome")
                result="Chome Browser is selected";
            else if (browserName=="firefox")
                result="Firefox Browser is selected";
            else if (browserName=="opera")
                result="Opera Browser is selected";
            else if (browserName=="safari")
                result="Safari Browser is selected";
            else
                result="EDGE Browser is selected";

                System.out.println(result);


        }else{
            System.err.println("Invalid Browser Name");
        }

    }
}
/*
2. Create a class called Browser.
Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */
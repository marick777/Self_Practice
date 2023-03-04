package day12_CustomMethod;

public class DaysInMonth {
    public static void main(String[] args) {
        numberOfDays("jUne");


    }

    public static void numberOfDays(String month) {
        month = ("" + month.charAt(0)).toUpperCase() + month.substring(1).toLowerCase();

        //String result = month + " has ";

        switch (month) {
            case "February":
                month +=" has "+ 28 + " days";
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                month +=" has "+ 30 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                month +=" has "+ 31 + " days";
                break;

            default:
                month = "Invalid month";
        }

        System.out.println(month);

    }




}
/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */

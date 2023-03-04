package day03_variables;

public class Rectangle {

    public static void main(String[] args) {

        int length = 23;
        double width = 33.7;
        double area = length * width;
        double perimeter = 2 * (length + width);
        boolean test = area > 100;

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("test = " + test);

    }
}
/*
 Create a class named Rectangle
  Declare the following variables:
    1. width
    2. Length
 Write a program that can display the area & perimeter of the rectangle
 Hints: area = width * length
        perimeter = 2 * (length + width)
 */
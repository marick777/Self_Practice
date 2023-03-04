package day04_primitiveTypeCastings;

public class Circle {

    public static void main(String[] args) {

        int radius = 5;
        double area = 3.14*(radius*radius);
        float perimeter = (float)(2*3.14*radius);


        System.out.println("Area of the circle is "+area+"\n"+"Perimeter of the circle is "+perimeter);



    }
}
/*
6. Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
 */
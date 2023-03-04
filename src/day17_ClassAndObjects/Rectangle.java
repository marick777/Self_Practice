package day17_ClassAndObjects;

public class Rectangle {

    public double length;
    public double width;

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Rectangle Aria is: "+(length*width)+
                ", Rectangle Perimeter is: "+(2*(length+width))+
                '}';
    }

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;



    }

    public void calculateArea(){
        System.out.println("Rectangle Aria is: "+(length*width));
    }

    public void calculatePerimeter(){
        System.out.println("Rectangle Perimeter is: "+(2*(length+width)));
    }
}
/*
double area = length * width;
        double perimeter = 2 * (length + width);
create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object
 */

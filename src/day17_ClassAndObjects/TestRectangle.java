package day17_ClassAndObjects;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setInfo(20,30);
        Rectangle r2 = new Rectangle();
        r2.setInfo(10,5.7);
        Rectangle r3 = new Rectangle();
        r3.setInfo(3.6, 4.5);


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println();
        r2.calculateArea();
        r3.calculatePerimeter();
        r1.calculateArea();
    }
}

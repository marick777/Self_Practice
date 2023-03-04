package day17_ClassAndObjects;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Lexus", "GS450h", 2007, "Smoky Granite Mica", 12000 );
        Car car2 = new Car();
        car2.setInfo("BMW", "X5M", 2012, "Black", 18500);
        Car car3 = new Car();
        car3.setInfo("Audi", "RS8", 2012, "Red", 21300);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();
        car2.start();


    }
}

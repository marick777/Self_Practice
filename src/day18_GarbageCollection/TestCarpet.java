package day18_GarbageCollection;

public class TestCarpet {
    public static void main(String[] args) {

        Carpet cp1 = new Carpet();
        cp1.setInfo(3.5,6,2.5,true);

        Carpet cp2 = new Carpet();
        cp2.setInfo(2,5,2, false);


        System.out.println("Total Price: $"+cp1.calcCost());
        System.out.println("Total Price: $"+cp2.calcCost());
        System.out.println(cp1);
        System.out.println(cp2);



    }
}

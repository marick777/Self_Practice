package day17_ClassAndObjects;

public class TestItem {
    public static void main(String[] args) {

        Item i1 = new Item();
        i1.setInfo("Apple",1,5);
        Item i2 = new Item();
        i2.setInfo("Orange",2.3,2);
        Item i3 = new Item();
        i3.setInfo("Pineapple",3.9, 5);


        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println();
        i1.calcCoast();

    }
}

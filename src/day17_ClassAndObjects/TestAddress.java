package day17_ClassAndObjects;

public class TestAddress {
    public static void main(String[] args) {

        Address a1 = new Address();
        a1.setInfo("7925", "Jones Branch Dr", "McLean", "VA", 22012);
        Address a2 = new Address();
        a2.setInfo("NW 1256", "Harlem Ave", "Danville", "IL", 23498);
        Address a3 = new Address();
        a3.setInfo("56100","W Diversey PKWY", "Omaha", "NE", 36952);


        System.out.println(a1);
        System.out.println();
        System.out.println(a2);
        System.out.println();
        System.out.println(a3);

    }
}


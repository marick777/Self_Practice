package day18_GarbageCollection;

public class TestContact {
    public static void main(String[] args) {


        Contact ct1 = new Contact();
        ct1.setInfo("Joht", "qwerty@google.com", 777555775);
        Contact ct2 = new Contact();
        ct2.setInfo("Vova", "vitea@aaa.com", 123456789);

        System.out.println(ct1.sendMessage());
        System.out.println();
        System.out.println(ct1.call());
        System.out.println();
        System.out.println(ct1.sendEmail());
        System.out.println();
        System.out.println(ct1);
        System.out.println();
        System.out.println(ct2.call());
        System.out.println();
        System.out.println(ct2.sendMessage());
        System.out.println();
        System.out.println(ct2.sendEmail());
        System.out.println();
        System.out.println(ct2);
    }
}

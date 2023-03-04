package day30_inheritance.bookTask;

public class TestBookObject {
    public static void main(String[] args) {


        EBook ebook1 = new EBook("Book1", "Classic", "Some Author", 15.55, "Midium", 333);
        AudioBook abook1 = new AudioBook("Book2", "Education", "Teacher", 19.69, 60, "Paha");

        ebook1.readBook();
        System.out.println(ebook1);
        System.out.println(abook1);
    }
}

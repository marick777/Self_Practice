package day30_inheritance.bookTask;

public class EBook extends Book {



    private String size;
    private int page;

    public EBook(String title, String type, String author, double price, String size, int page) {
        super(title, type, author, price);
        setSize(size);
        setPage(page);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if(page<=0){
            System.err.println("pages can not be set to zero or negative");
            System.exit(1);
        }
        this.page = page;
    }

    public void readBook(){
        System.out.println(getTitle()+" is reading");
    }
}

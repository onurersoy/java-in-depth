package section3.part4.constructors;

public class Book {
    public String title;

    public Book() {}

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }
}

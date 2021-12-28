package section3.part4.constructors;

public class Instructor {

        public long id;
        public String name;
        public String title;
        public String department;
        public Book[] books;

        //2nd way for constructing:
        /*public Instructor(long id, String name, String title, String department, Book[] books) {
            this(id, name, title, department);
            this.books = books;
        }

        public Instructor(long id, String name, String title, String department) {
            this(id, name, title);
            this.department = department;
        }

        public Instructor(long id, String name, String title) {
            this(id, name);
            this.title = title;
        }

        public Instructor(long id, String name) {
            this.id = id;
            this.name = name;
        }*/

        //1st way for constructing:
        //Primary Constructor:
        public Instructor(long id, String name, String title, String department, Book[] books) {
            this.id = id;
            this.name = name;
            this.title = title;
            this.department = department;
            this.books = books;
        }

        public Instructor(long id, String name, String title, String department) {
            this(id, name, title, department, null);
        }

        public Instructor(long id, String name, String title) {
            this(id, name, title, null, null);
        }

        public Instructor(long id, String name) {
            this(id, name, null, null, null);
        }

        public String getMostRecentBookTitle() {
            String mostRecentBookTitle = books[books.length - 1].getTitle();
            return mostRecentBookTitle;
        }

        //TODO
        public Book updateBook(int index, String title) {
            Book newBook = new Book(books[index].setTitle(title));
            return newBook;
        }

        /*Undesired solution:
        public Book updateBookUnDesired(int index, String title) {
            Book oldBook = books[index];
            books[index].setTitle(title);
            return oldBook;
        }*/

        /*Original solution from course content:
        public Book updateBookVanilla(int index, String title) {
            Book oldBook = new Book(books[index].getTitle());
            books[index].setTitle(title);
            return oldBook;
        }*/

        /*Solution version 2 from course content:
        public Book updateBookVanilla2(int index, String title) {
            Book oldBook = new Book(); //needs no-arg constructor in 'Book' class
            oldBook.setTitle(books[index].getTitle());

            books[index].setTitle(title);
            return oldBook;
        }*/

        //TODO
        public Book updateBook(int index, Book book) {
            Book newBook = books[index];
            books[index] = book;
            return newBook;
        }

        public static void main(String[] args) {
            Book book1 = new Book("Java for Beginners");
            Book book2 = new Book("Scala for Beginners");
            Book book3 = new Book("Effective Python");

            Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
            System.out.println(instructor.getMostRecentBookTitle());
            System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());

            //TODO: ask it!
            Book book4 = new Book("Introduction to Data Mining");
            System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
        }
    }

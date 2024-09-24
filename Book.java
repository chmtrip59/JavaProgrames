public class Book {

    static int totalNoOfBook;

    String title;

    String author;

    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBook = 0;
    }
    { // Object Init
        totalNoOfBook++;
    }

    Book(String isbn, String author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBook;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book");
        } else {
            System.out.println("This book is already in library");
        }
    }

    public static void main(String[] args) {

        Book designOfThings = new Book("1", "Author", "Design");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();

    }
}

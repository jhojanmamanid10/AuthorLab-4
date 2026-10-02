import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private String email;
    private List<Book> books;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
        this.books = new ArrayList<>();
    }

    // Sobrecarga de addBook()
    public void addBook(Book book) {
        books.add(book);
        book.setAuthor(this);
    }

    public void addBook(String title, double price) {
        Book book = new Book(title, price, this);
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void displayBooks() {
        System.out.println("Author: " + name);

        for (Book book : books) {
            book.displayInfo();
        }
    }
}
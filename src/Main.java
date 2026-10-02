public class Main {

    public static void main(String[] args) {

        Author author = new Author(
            "Gabriel García Márquez",
            "gabriel@email.com"
        );

        // Usando addBook(Book)
        Book book1 = new Book("Cien años de soledad", 35.0);
        author.addBook(book1);

        // Usando addBook(String, double)
        author.addBook("El amor en los tiempos del cólera", 40.0);

        author.displayBooks();
    }
}
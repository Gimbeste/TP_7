import Books.*;

import java.util.ArrayList;

public class BookStore {
    //Database
    private ArrayList<Book> books;

    public BookStore() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        // Assume this logic adds a physical book to the database
        System.out.println("Adding a " + book.getType() + "  book: " + book.getTitle());
        books.add(book);
        // No implementation for e-books or audiobooks, violating OCP
    }

    public void printBooks()
    {
        for(Book b : books)
        {
            System.out.println(b.getType()+ " " + b.getTitle() + " " + b.getPrice());
        }
    }
}
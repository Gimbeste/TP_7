import Books.*;

public class Admin implements AdminActions {
    BookStore store;
    public Admin(BookStore store)
    {
        this.store = store;
    }

    public void reviewBook(String title, String review) {
        System.out.println("Admin reviews a book: " + title + " with review: " + review);
    }
    // AdminSpecificActions implementations

    public void addBookToStore(Book book) {
        System.out.println("Adding book to store: " + book.getTitle() + ", Type: " + book.getType() + ", Price: " + book.getPrice());// Logic for adding a book to the inventory
        store.addBook(book);
    }

    public void removeBookFromStore(Book book) {
        System.out.println("Removing book from store: " + book.getTitle());
        // Logic for removing a book from the inventory
    }
}
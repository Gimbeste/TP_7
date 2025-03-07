import Books.*;

public class Customer implements CustomerActions {
    BookStore store;

    public Customer()
    {
        store = new BookStore();
    }

    public void borrowBook(Book book) {
        System.out.println("Customer borrows a book: " + book.getTitle());
// Logic for a customer to borrow a book
    }
    public void returnBook(Book book) {
        System.out.println("Customer returns a book: " + book.getTitle());
// Logic for a customer to return a book
    }
    public void reviewBook(Book book, String review) {
        System.out.println("Customer reviews a book: " + book.getTitle() + " with review: " + review);
// Logic for a customer to review a book
    }
    // AdminSpecificActions implementations
}
import Books.*;

public interface CustomerActions {
    void borrowBook(Book book);
    void returnBook(Book book);
    void reviewBook(Book book, String review);
}

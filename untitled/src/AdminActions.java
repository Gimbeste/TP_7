import Books.*;

public interface AdminActions {
    void reviewBook(String title, String review);
    void addBookToStore(Book book);
    void removeBookFromStore(Book book);
}
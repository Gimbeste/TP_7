public interface CustomerActions {
    void borrowBook(String bookTitle);
    void returnBook(String bookTitle);
    void reviewBook(String bookTitle, String review);
}
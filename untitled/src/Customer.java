public class Customer implements CustomerActions {
    @Override
    public void borrowBook(String bookTitle) {
        System.out.println("Customer borrows a book: " + bookTitle);
// Logic for a customer to borrow a book
    }
    @Override
    public void returnBook(String bookTitle) {
        System.out.println("Customer returns a book: " + bookTitle);
// Logic for a customer to return a book
    }
    @Override
    public void reviewBook(String bookTitle, String review) {
        System.out.println("Customer reviews a book: " + bookTitle + " with review: " + review);
// Logic for a customer to review a book
    }
}
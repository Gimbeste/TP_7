import Books.*;

public class Main {
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        NotificationSender notificationService = new EmailSender();
        OrderComponent orderProcessor = new OrderComponent(notificationService);

        Book physicalBook = new PhysicalBook("The Java Handbook", 29.99);
        Book ebook = new EBook("Advanced Java Topics", 19.99);

        bookstore.addBook(physicalBook);
        bookstore.addBook(ebook);

        orderProcessor.processOrder(physicalBook, "user@example.com");

        Customer customer = new Customer();

        Book b = bookstore.searchBook("The Java Handbook");

        customer.borrowBook(b);
        customer.returnBook(b);
        customer.reviewBook(b, "Great book!");

        Admin admin = new Admin(bookstore);
        admin.addBookToStore(new AudioBook("Java Audio Guide", 15.99));
        admin.reviewBook("Advanced Java Topics", "Excellent depth!");
    }
}
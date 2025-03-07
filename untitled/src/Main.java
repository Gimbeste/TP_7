import Books.*;

public class Main {
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        Book b = new AudioBook("Bite", -1);
        bookstore.addBook(b);
        bookstore.printBooks();
//        bookstore.processOrder("The Java Handbook", "user@example.com");
        Customer customer = new Customer();
        customer.borrowBook("The Java Handbook");
        customer.returnBook("The Java Handbook");
        customer.reviewBook("The Java Handbook", "Great book for beginners!");
        Admin admin = new Admin();
        admin.reviewBook("Advanced Java Topics", "Excellent depth!");
    }
}
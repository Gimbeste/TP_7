public class OrderComponent {
    public void processOrder(String bookTitle, String userEmail) {
        System.out.println("Processing order for " + bookTitle);
// Assume this logic processes an order and notifies the user
        EmailSender e = new EmailSender();
        e.sendNotification(userEmail, "Your order for " + bookTitle + " has been processed.");
    }
}

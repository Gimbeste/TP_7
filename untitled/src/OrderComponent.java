import Books.*;

public class OrderComponent {
    private NotificationSender sender;

    public OrderComponent(NotificationSender sender)
    {
        this.sender = sender;
    }

    public void processOrder(Book book, String userEmail) {
        System.out.println("Processing order for " + book.getTitle());
        // Assume this logic processes an order and notifies the user
        sender.sendNotification(userEmail, "Your order for " + book.getTitle() + " has been processed.");
    }
}

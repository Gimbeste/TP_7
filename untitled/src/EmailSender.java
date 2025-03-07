public class EmailSender implements NotificationSender{
    public void sendNotification(String email, String message) {
        System.out.println("Sending email to " + email + " with message: " + message);
// Assume this logic sends an email, creating a direct dependency, violating DIP
    }
}

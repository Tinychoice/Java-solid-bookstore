interface NotificationService {
    void sendNotification(String recipient, String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
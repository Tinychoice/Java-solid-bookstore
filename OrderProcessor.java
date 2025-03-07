class OrderProcessor {
    private NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(Book book, String userEmail) {
        System.out.println("Processing order for: " + book.title);
        notificationService.sendNotification(userEmail, "Your order for " + book.title + " has been processed.");
    }
}

public class BookStore {
    public void addBook(String title, String type, double price) {
    if ("PHYSICAL".equals(type)) {
    System.out.println("Adding a physical book: " + title);
    // Assume this logic adds a physical book to the database
    }
    // No implementation for e-books or audiobooks, violating OCP
    }
    public void processOrder(String bookTitle, String userEmail) {
    System.out.println("Processing order for " + bookTitle);
    // Assume this logic processes an order and notifies the user
    sendNotification(userEmail, "Your order for " + bookTitle + " has been processed.");
    }
    private void sendNotification(String email, String message) {
    System.out.println("Sending email to " + email + " with message: " + message);
    // Assume this logic sends an email, creating a direct dependency, violating DIP
    }
    }
    
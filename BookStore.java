import java.util.ArrayList;
import java.util.List;


class BookStore {
    private List<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Added book: " + book.title);
    }

    public List<Book> getInventory() {
        return inventory;
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
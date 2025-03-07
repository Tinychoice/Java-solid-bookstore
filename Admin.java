public class Admin implements UserActions {
    @Override
    public void borrowBook(String bookTitle) {
    // Not applicable for Admin, violates ISP
    }
    @Override
    public void returnBook(String bookTitle) {
    // Not applicable for Admin, violates ISP
    }
    @Override
    public void reviewBook(String bookTitle, String review) {
    System.out.println("Admin reviews a book: " + bookTitle + " with review: " + review);
    }
    // AdminSpecificActions implementations
    @Override
    public void addBookToStore(String title, String type, double price) {
    System.out.println("Adding book to store: " + title + ", Type: " + type + ", Price: " + price);
    // Logic for adding a book to the inventory
    }
    @Override
    public void removeBookFromStore(String title) {
    System.out.println("Removing book from store: " + title);
    // Logic for removing a book from the inventory
    }
    }

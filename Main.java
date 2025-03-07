public class Main {
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        Book javaBook = new PhysicalBook("The Java Handbook", 29.99);
        Book kotlinBook = new EBook("Kotlin Guide", 19.99);

        bookstore.addBook(javaBook);
        bookstore.addBook(kotlinBook);

        NotificationService emailService = new EmailNotification();
        OrderProcessor orderProcessor = new OrderProcessor(emailService);
        orderProcessor.processOrder(javaBook, "user@example.com");

        Customer customer = new Customer();
        customer.borrowBook("The Java Handbook");
        customer.returnBook("The Java Handbook");
        customer.reviewBook("The Java Handbook", "Great book for beginners!");

        Admin admin = new Admin();
        admin.addBookToStore(new PhysicalBook("Clean Code", 35.99));
        admin.removeBookFromStore("The Java Handbook");
    }
}
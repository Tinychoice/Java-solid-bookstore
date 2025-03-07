public interface UserActions {
    void borrowBook(String bookTitle);
    void returnBook(String bookTitle);
    void reviewBook(String bookTitle, String review);
    void addBookToStore(String title, String type, double price);
    void removeBookFromStore(String title);
    }
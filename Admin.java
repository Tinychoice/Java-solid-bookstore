class Admin implements Reviewable, InventoryManagement {
    @Override
    public void reviewBook(String bookTitle, String review) {
        System.out.println("Admin reviews " + bookTitle + ": " + review);
    }

    @Override
    public void addBookToStore(Book book) {
        System.out.println("Admin added: " + book.title);
    }

    @Override
    public void removeBookFromStore(String title) {
        System.out.println("Admin removed: " + title);
    }
}

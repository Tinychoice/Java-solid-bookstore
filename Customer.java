class Customer implements Borrowable, Reviewable {
    @Override
    public void borrowBook(String bookTitle) {
        System.out.println("Customer borrows " + bookTitle);
    }

    @Override
    public void returnBook(String bookTitle) {
        System.out.println("Customer returns " + bookTitle);
    }

    @Override
    public void reviewBook(String bookTitle, String review) {
        System.out.println("Customer reviews " + bookTitle + ": " + review);
    }
}

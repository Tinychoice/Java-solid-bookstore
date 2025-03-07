abstract class Book {
    protected String title;
    protected double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public abstract void displayInfo();
}

class PhysicalBook extends Book {
    public PhysicalBook(String title, double price) {
        super(title, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Physical Book: " + title + " - Price: " + price);
    }
}

class EBook extends Book {
    public EBook(String title, double price) {
        super(title, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + title + " - Price: " + price);
    }
}


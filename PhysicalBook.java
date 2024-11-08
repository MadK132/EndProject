public class PhysicalBook extends Book {
    public PhysicalBook(String title, String author, int quantity) {
        super(title, author, quantity, "Physical");
    }

    @Override
    public void displayDetails() {
        System.out.println("Physical Book: " + title + " by " + author + " (Quantity: " + quantity + ")");
    }
}

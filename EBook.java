public class EBook extends Book {
    public EBook(String title, String author, int quantity) {
        super(title, author, quantity, "EBook");
    }

    @Override
    public void displayDetails() {
        System.out.println("EBook: " + title + " by " + author + " (Quantity: " + quantity + ")");
    }
}
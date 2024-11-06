public class PhysicalBook extends Book {

    public PhysicalBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        System.out.println("Physical Book: " + title + " by " + author);
    }
}

public class EBook extends Book {

    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        System.out.println("EBook: " + title + " by " + author);
    }
}

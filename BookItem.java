public class BookItem extends LibraryComponent {
    private String title;

    public BookItem(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book: " + title);
    }
}

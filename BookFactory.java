public class BookFactory {
    public static Book createBook(String type, String title, String author, int quantity) {
        if (type.equalsIgnoreCase("Physical")) {
            return new PhysicalBook(title, author, quantity);
        } else if (type.equalsIgnoreCase("EBook")) {
            return new EBook(title, author, quantity);
        }
        return null;
    }
}

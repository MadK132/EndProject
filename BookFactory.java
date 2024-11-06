public class BookFactory {
    public static Book createBook(String type, String title, String author) {
        if (type.equalsIgnoreCase("Physical")) {
            return new PhysicalBook(title, author);
        } else if (type.equalsIgnoreCase("EBook")) {
            return new EBook(title, author);
        }
        return null;
    }
}

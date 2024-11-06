public class LibraryFacade {
    private Library library = Library.getInstance();

    public void borrowBook(String title) {
        System.out.println("Borrowing book: " + title);
        library.removeBook(getBookByTitle(title));
        library.notifyObservers("The book '" + title + "' has been borrowed.");
    }

    public void returnBook(String title) {
        System.out.println("Returning book: " + title);
        // Assuming that the book is a physical book in this example.
        library.addBook(new PhysicalBook(title, "Unknown Author"));
        library.notifyObservers("The book '" + title + "' has been returned.");
    }

    private Book getBookByTitle(String title) {
        for (Book book : library.books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }
}

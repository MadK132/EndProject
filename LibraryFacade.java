public class LibraryFacade {
    private Library library = Library.getInstance();

    public void borrowBook(String title) {
        Book book = getBookByTitle(title);
        if (book != null && book.getQuantity() > 0) {
            book.setQuantity(book.getQuantity() - 1);
            System.out.println("Borrowed book: " + title + " (Remaining: " + book.getQuantity() + ")");
            library.notifyObservers("The book '" + title + "' has been borrowed.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available.");
        }
    }

    public void returnBook(String title) {
        Book book = getBookByTitle(title);
        if (book != null) {
            book.setQuantity(book.getQuantity() + 1);
            System.out.println("Returned book: " + title + " (Available: " + book.getQuantity() + ")");
            library.notifyObservers("The book '" + title + "' has been returned.");
        } else {
            System.out.println("This book does not exist in the library.");
        }
    }

    private Book getBookByTitle(String title) {
        for (Book book : library.books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

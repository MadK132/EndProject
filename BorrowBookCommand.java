public class BorrowBookCommand implements Command {
    private LibraryFacade libraryFacade;
    private String bookTitle;

    public BorrowBookCommand(LibraryFacade libraryFacade, String bookTitle) {
        this.libraryFacade = libraryFacade;
        this.bookTitle = bookTitle;
    }

    @Override
    public void execute() {
        libraryFacade.borrowBook(bookTitle);
    }
}

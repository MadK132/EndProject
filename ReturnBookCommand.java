public class ReturnBookCommand implements Command {
    private LibraryFacade libraryFacade;
    private String bookTitle;

    public ReturnBookCommand(LibraryFacade libraryFacade, String bookTitle) {
        this.libraryFacade = libraryFacade;
        this.bookTitle = bookTitle;
    }

    @Override
    public void execute() {
        libraryFacade.returnBook(bookTitle);
    }
}

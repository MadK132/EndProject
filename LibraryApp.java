public class LibraryApp {
    private static LibraryApp instance;

    private LibraryApp() { }

    public static LibraryApp getInstance() {
        if (instance == null) {
            instance = new LibraryApp();
        }
        return instance;
    }
}

import java.util.Scanner;

public class LibraryManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static LibraryFacade libraryFacade = new LibraryFacade();

    public static void main(String[] args) {
        Book book1 = BookFactory.createBook("Physical", "War and Peace", "Leo Tolstoy");
        Book book2 = BookFactory.createBook("EBook", "1984", "George Orwell");
        Book book3 = BookFactory.createBook("Physical", "Moby Dick", "Herman Melville");

        Library library = Library.getInstance();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        library.addObserver(user1);
        library.addObserver(user2);

        System.out.println("Welcome to the Library Management System!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.viewBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    returnBook(returnTitle);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Library Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void borrowBook(String title) {
        Command borrowCommand = new BorrowBookCommand(libraryFacade, title);
        borrowCommand.execute();
    }

    private static void returnBook(String title) {
        Command returnCommand = new ReturnBookCommand(libraryFacade, title);
        returnCommand.execute();
    }
}

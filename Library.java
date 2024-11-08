import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    List<Book> books;
    private List<Observer> observers;

    private Library() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void viewBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            book.displayDetails();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void saveToFile(String filename) {
        Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(Book.class, new BookTypeAdapter()).create();
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(this.books, writer);
            System.out.println("Library saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(String filename) {
        Gson gson = new GsonBuilder().registerTypeAdapter(Book.class, new BookTypeAdapter()).create();
        try (FileReader reader = new FileReader(filename)) {
            Book[] loadedBooks = gson.fromJson(reader, Book[].class);

            if (loadedBooks != null) {
                books.clear();
                for (Book book : loadedBooks) {
                    books.add(book);
                }
                System.out.println("Library loaded from " + filename);
            } else {
                System.out.println("No books found in " + filename);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (JsonParseException e) {
            System.out.println("Error parsing JSON data: " + e.getMessage());
        }
    }
}

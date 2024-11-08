# EndProject
Why Library Management System?

A Library Management System is a practical and useful application that can showcase multiple design patterns effectively.

Why MVC Architecture was Chosen?

The MVC (Model-View-Controller) architecture was selected for the Library Management System because it offers a clear separation of concerns, making the application easier to manage, test, and extend.

Model: Handles the core business logic, such as managing the book inventory, borrowing and returning books, and keeping track of users.

Controller: Manages user input, communicates with the Model to process data, and updates the View.


# Creational Patterns:

Singleton Pattern:

Purpose: The Singleton pattern ensures that there is only one instance of the Library class in the application, managing the entire book inventory and user data. This guarantees consistency and avoids conflicts in managing the system’s resources.

Factory Method Pattern:

Purpose: The Factory Method pattern is used to handle the creation of various types of books (such as PhysicalBook and EBook). This allows for easy expansion if new book types need to be introduced in the future.

# Structural Patterns:

Observer Pattern:

Purpose: The Observer pattern is used to notify users when a book they are interested in becomes available. Instead of manually checking for availability, users are automatically notified when the status of a book changes.

Facade Pattern:

Purpose: The Facade pattern simplifies the interface for interacting with the core system. It abstracts complex operations, making it easier for the user to interact with the system.

# Behavioral Patterns:

Command Pattern:

Purpose: The Command pattern encapsulates requests as objects, allowing for flexible handling of user actions such as borrowing and returning books.

Iterator Pattern:

Purpose: The Iterator pattern allows for sequential access to a collection of books without exposing its internal structure. It provides a uniform way to traverse through the book collection.


# Class Descriptions and Their Roles

Library:

Role: This class serves as the main model of the system, managing books and users. It uses the Singleton pattern to ensure there is only one instance.

Book:

Role: Represents the general structure of a book in the library.

User:

Role: Represents a user of the library.

BookFactory:

Role: Creates different types of books (physical or e-book).

LibraryFacade:

Role: Provides a simplified interface for interacting with the library system.

BorrowBookCommand / ReturnBookCommand:

Role: Encapsulates actions for borrowing and returning books.

Iterator:

Role: Provides a way to iterate over the collection of books.

Observer:

Role: Notifies users when a book they are interested in becomes available.

BookTypeAdapter:

Role: Handling the serialization and deserialization of polymorphic Book objects (such as PhysicalBook and EBook).


# Assumption:

Each book in the library has a unique title.

Users are uniquely identified by their names (though the current implementation does not store a list of all registered users).

The library starts with a pre-defined collection of books (added in main method).

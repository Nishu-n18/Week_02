package level2;

import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "'}";
    }
}

// Library class
class LibraryM {
    private String name;
    private List<Book> books;

    // Constructor
    public LibraryM(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display books in the library
    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main class to demonstrate aggregation
class Library {
    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("Half girlfriend", "Chetan Bhagat");
        Book book2 = new Book("Harry potter", "j.k rowling");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create Library objects
        LibraryM library1 = new LibraryM("Learning route");
        LibraryM library2 = new LibraryM("A1 library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();
        library2.displayBooks();

        // Demonstrate that books exist independently
        System.out.println("\nBooks exist independently:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}

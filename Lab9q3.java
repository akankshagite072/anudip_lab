
/*3. write a program to create Book management system.using linked list

create class name Book,and perform following actions:

Attributes:

bookid,bookName,bookPrice,authorName,library name(static),availability

method:

createBook() will store book details.(add  3 books).

deleteBook() will delete book by Id

displayBook()will display book details*/

import java.util.LinkedList;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    String authorName;
    static String libraryName = "Library";
    boolean availability;

    public Book(int bookId, String bookName, double bookPrice, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = true;
    }

    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: Rs" + bookPrice + ", Author: " + authorName
                + ", Availability: " + (availability ? "Available" : "Not Available");
    }
}

public class Lab9q3 {
    static LinkedList<Book> books = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }

            displayMenu();
        }
    }

    static void displayMenu() {
        System.out.println("\nBook Management System");
        System.out.println("1. Add a Book");
        System.out.println("2. Delete a Book by ID");
        System.out.println("3. Display All Books");
        System.out.println("4. Exit");
    }

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();
        System.out.print("Enter Book Price: ");
        double bookPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String authorName = scanner.nextLine();

        books.add(new Book(bookId, bookName, bookPrice, authorName));
        System.out.println("Book added successfully!");
    }

    static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int bookId = scanner.nextInt();
        boolean found = false;

        for (Book book : books) {
            if (book.bookId == bookId) {
                books.remove(book);
                System.out.println("Book deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book with ID " + bookId + " not found!");
        }
    }

    static void displayBooks() {
        System.out.println("\nLibrary: " + Book.libraryName);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean issued;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    void displayBook() {
        System.out.println("--------------------------------");
        System.out.println("Book ID     : " + bookId);
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Status      : " +
                (issued ? "Issued" : "Available"));
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addBook() {

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(bookId, title, author));

        System.out.println("\nBook added successfully!");
    }

    static void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("\nNo books available.");
            return;
        }

        System.out.println("\n========== LIBRARY BOOKS ==========");

        for (Book b : books) {
            b.displayBook();
        }
    }

    static void searchBook() {

        System.out.print("Enter Book ID to search: ");
        int bookId = sc.nextInt();

        for (Book b : books) {

            if (b.bookId == bookId) {
                System.out.println("\nBook found!");
                b.displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    static void issueBook() {

        System.out.print("Enter Book ID to issue: ");
        int bookId = sc.nextInt();

        for (Book b : books) {

            if (b.bookId == bookId) {

                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    static void returnBook() {

        System.out.print("Enter Book ID to return: ");
        int bookId = sc.nextInt();

        for (Book b : books) {

            if (b.bookId == bookId) {

                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    static void deleteBook() {

        System.out.print("Enter Book ID to delete: ");
        int bookId = sc.nextInt();

        for (Book b : books) {

            if (b.bookId == bookId) {

                books.remove(b);
                System.out.println("Book deleted successfully!");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n================================");
            System.out.println("      LIBRARY MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    deleteBook();
                    break;

                case 7:
                    System.out.println("Thank you for using the Library Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
package Library_Project;

import java.util.Scanner;

public class Librarian extends User {
    static Scanner sc = new Scanner(System.in);

    public Librarian(String userId) {
        super(userId);
    }

    public void librarianOptions() {
        while (true) {
            System.out.println("1)Add a book\n2)Register a student\n3)See students list\n4)Assign a book\n5)Submit a book\n6)Renew a book\n7)Show all books\n8)Change user\n Press 0 to exit:");
            int choice = sc.nextInt();
            executeOperation(choice);
        }
    }

    private void executeOperation(int choice) {
        switch (choice) {
            case 1:
                getBookDetails();
                break;
            case 2:
                registerStudent();
                break;
            case 3:
                // Implement according to your logic
                break;
            case 4:
                // Implement according to your logic
                break;
            case 5:
                // Implement according to your logic
                break;
            case 6:
                // Implement according to your logic
                break;
            case 7:
                LibraryManager.displayBooks();
                break;
            case 8:
                // Implement according to your logic
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    private static void getBookDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book name:");
        String bookName = sc.nextLine();
        System.out.println("Enter book author:");
        String authorName = sc.nextLine();
        System.out.println("Enter book serial number:");
        long serial = sc.nextLong();
        System.out.println("Enter book quantity:");
        int quantity = sc.nextInt();

        LibraryManager.addBook(serial, bookName, authorName, quantity);

        System.out.println("Book added successfully: " + bookName + ", Quantity: " + quantity);
    }

    public static void registerStudent() {
        // Implement according to your logic
    }
}

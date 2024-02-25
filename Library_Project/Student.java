package Library_Project;

import java.util.Scanner;

public class Student extends User {
    static Book[] tookBook = new Book[5];
    static Scanner sc = new Scanner(System.in);

    public Student(String userId) {
        super(userId);
    }

    public void studentOptions() {
        while (true) {
            System.out.println("1)Take a book\n2)Show available books\n3)Show taken books\n4)Return a book\n5)Renew a book\n8)Change user\n Press 0 to exit:");
            int choice = sc.nextInt();
            executeOperation(choice);
        }
    }

    private void executeOperation(int choice) {
        switch (choice) {
            case 1:
                assignBook();
                break;
            case 2:
                LibraryManager.displayBooks();
                break;
            case 3:
                displayBooksTaken(tookBook);
                break;
            case 4:
                submitBook();
                break;
            case 5:
                renewBook();
                break;
            case 6:
                break;
            case 7:
                LibraryManager.displayBooks();
                break;
            case 8:
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    private void displayBooksTaken(Book[] tookBook) {
        System.out.println("Books taken by user " + userId + ":");
        for (Book book : tookBook) {
            if (book != null) {
                System.out.println(book.serialNumber + "\t" + book.bookName + "\t" + book.author + "\t" + book.quantity);
            }
        }
    }

    
}

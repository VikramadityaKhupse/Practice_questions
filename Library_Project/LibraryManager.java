package Library_Project;
import java.util.Scanner;


public class LibraryManager {
        static Book storedBook[] = new Book[50];
        static Student students[] = new Student[100];
        private static int bookCount = 0;

    public static void addBook(long serialNumber, String bookName, String author, int quantity) {
         Book b1 = new Book(serialNumber, bookName, author, quantity);
         storedBook[bookCount] = b1;
         bookCount++;

        
    }

    public static void displayBooks() {
        System.out.println("Available Books:");
        for(Book aBook : storedBook){
            System.out.println(aBook.serialNumber+"\t"+aBook.bookName +"\t"+aBook.author+"\t"+aBook.quantity);

        }
    }

    public static void renewBook(Scanner sc) {
        // Pass
    }

    public static void submitBook(Scanner sc) {
        // Pass
    }

    public static void takeBook(Scanner sc) {
        // Pass
    }
}

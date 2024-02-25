package Library_Project;

public class LibraryManager {
    static Book storedBooks[] = new Book[50];
    static Student students[] = new Student[100];
    private static int studentCount = 0;
    private static int bookCount = 0;

    public static void addBook(long serialNumber, String bookName, String author, int quantity) {
        Book b1 = new Book(serialNumber, bookName, author, quantity);
        storedBooks[bookCount] = b1;
        bookCount++;
    }

    public static void displayBooks() {
        System.out.println("Available Books:");
        for (Book aBook : storedBooks) {
            if (aBook != null) {
                System.out.println(aBook.serialNumber + "\t" + aBook.bookName + "\t" + aBook.author + "\t" + aBook.quantity);
            }
        }
    }

    public static void addStudent(Student student) {
        students[studentCount] = student;
        
        studentCount++;
    }

    public static Book findBookBySerial(long serialNumber) {
        for (Book book : storedBooks) {
            if (book != null && book.serialNumber == serialNumber) {
                return book;
            }
        }
        return null; 
    }

    public static void increaseBookCount(Book book) {
        for (Book storedBooks : storedBooks) {
            if (storedBooks != null && storedBooks.serialNumber == book.serialNumber) {
                // Found the book in the library's stored books
                storedBooks.quantity++; // Increase the book count
                System.out.println("Book count increased successfully.");
                return;
            }
        }
        System.out.println("Book with serial number " + book.serialNumber + " not found in library's list.");
    }
    
}

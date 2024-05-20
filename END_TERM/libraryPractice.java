package END_TERM;


/**
 * InnerlibraryPratice
 */
interface InnerlibraryPratice {
    void addBook(String name, String author, int id, int count) throws Exception;
    void showBooks();
    default void assignBook() throws Exception {
        // Default implementation
    }
    default void bookCount() {
        // Default implementation
    }
}

class Book {
    String name;
    String author;
    int id;
    int count;

    public Book(String name, String author, int id, int count) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.count = count;
    }
}

public class libraryPractice {
    int totalBooksCount = 0;
    static Book[] bookArray = new Book[100];

    public static void main(String[] args) {

        Student student = new Student();
        Librarian librarian = new Librarian();

        //librarian.addBook("harry", "java", 1, 20);
        librarian.addBook("vk", "python", 2, 20);
        librarian.addBook("ab", "c", 3, 20);
        librarian.addBook("cd", "c++", 4, 20);
        System.out.println(librarian.totalBooksCount);
        // System.out.println( bookArray[0].author);
        try {
            student.addBook("harry", "java", 1, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        student.showBooks();
    }

    public static boolean isBookAvail(Book book) {
        for (Book b : bookArray) {
            if (b != null && b.id == book.id) {
                return true;
            }
        }
        return false;
    }
}

class Student extends libraryPractice implements InnerlibraryPratice {
    int assignedBooksCount = 0;
    Book[] assignedBooks = new Book[5];

    public void addBook(String name, String author, int id, int count) throws Exception {
        Book newBook = new Book(name, author, id, count);
        if (!isBookAvail(newBook)) {
            throw new Exception("Book not found exception!");
        } else {
            assignedBooks[assignedBooksCount] = newBook;
            assignedBooksCount++;
            System.out.println("Book added successfully");
        }
    }

    public void showBooks() {
        System.out.println("\tNAME\tAUTHOR");
        for (Book book : assignedBooks) {
            if (book != null) { // Add null check here
                System.out.println("\t" + book.name + "\t" + book.author);
            }
        }
    }
}

class Librarian extends libraryPractice implements InnerlibraryPratice {
    public void addBook(String name, String author, int id, int count) {
        Book newBook = new Book(name, author, id, count);
        bookArray[totalBooksCount] = newBook;
        totalBooksCount++;


    }

    public void showBooks() {
        System.out.println("\tNAME\tAUTHOR");
        for (Book book : bookArray) {
            if (book != null) { // Add null check here
                System.out.println("\t" + book.name + "\t" + book.author);
            }
        }
    }
}

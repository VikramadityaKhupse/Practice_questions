import java.util.*;

class Library {
    static HashMap<String, Integer> books = new HashMap<>();
    static HashMap<String, String> borrowedBooks = new HashMap<>();

    public static void main(String[] args) {
        initializeLibrary();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice = userChoice(sc);
            switch (choice) {
                case 1:
                    availBooks();
                    break;
                case 2:
                    renewBook(sc);
                    break;
                case 3:
                    submitBook(sc);
                    break;
                case 4:
                    takeBook(sc);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int userChoice(Scanner sc) {
        System.out.println("WELCOME TO SGGS LIBRARY!!");
        System.out.println("(press ctrl+c to exit)");
        System.out.println(" 1)Available Books\n 2)Renew a book\n 3)Submit a book\n 4)Take a book\nEnter choice number: ");
        return sc.nextInt();
    }

    private static void initializeLibrary() {
        books.put("Science", 20);
        books.put("Maths", 20);
        books.put("Java", 20);
        books.put("Python", 20);
    }

    private static void availBooks() {
        System.out.println("Available Books:");
        for (Map.Entry<String, Integer> book : books.entrySet()) {
            String key = book.getKey();
            Integer value = book.getValue();
            System.out.println(key + " = " + value);
        }
    }

    private static void renewBook(Scanner sc) {
        System.out.println("Enter your student ID: ");
        String studentID = sc.next();
        System.out.println("Enter the book you want to renew: ");
        String bookName = sc.next();
        if (borrowedBooks.containsKey(studentID) && borrowedBooks.get(studentID).equals(bookName)) {
            System.out.println("Book renewed successfully for student ID " + studentID);
        } else {
            System.out.println("You have not borrowed this book or the student ID is incorrect.");
        }
    }

    private static void submitBook(Scanner sc) {
        System.out.println("Enter the book you want to submit: ");
        String bookName = sc.next();
        if (books.containsKey(bookName)) {
            books.put(bookName, books.get(bookName) + 1);
            System.out.println("Book submitted successfully.");
        } else {
            System.out.println("This book is not in the library records.");
        }
    }

    private static void takeBook(Scanner sc) {
        System.out.println("Enter your college ID: ");
        String collegeID = sc.next();
        System.out.println("Enter the book you want to take: ");
        String bookName = sc.next();
        if (books.containsKey(bookName) && books.get(bookName) > 0) {
            books.put(bookName, books.get(bookName) - 1);
            borrowedBooks.put(collegeID, bookName);
            System.out.println("Book taken successfully.");
        } else {
            System.out.println("This book is not available.");
        }
    }
}


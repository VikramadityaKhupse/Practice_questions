import java.util.*;

class Library {
    static HashMap<String, Integer> books = new HashMap<>();

    public static void main(String[] args) {
        
        initializeLibrary();
        availBooks();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(userChoice(sc));
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
        for (Map.Entry<String, Integer> book : books.entrySet()) {
            String key = book.getKey();
            Integer value = book.getValue();
            System.out.println(key + " = " + value);
        }
    }
}


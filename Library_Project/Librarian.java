package Library_Project;

import java.util.Scanner;

public class Librarian extends User{
    static Scanner sc = new Scanner(System.in);
    public Librarian(long userId) {
        super(userId);
    }

    public static void librarianOptions(){

        while (true) {
        System.out.println("1)Add a book\n2)Register a student\n3)See students list\n4)Assign a book\n5)Submit a book\n6)Renew a book\n7)Show all books\n8)Change user\n Prss 0 to exit:");
        int choice = sc.nextInt();
        executeOperation(choice);
        }
        


    }

    private static void executeOperation(int choice){

        switch (choice) {
            case 1:
                getBookDetails();
                
                break;
            
            case 2:
                
                break;
            
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                LibraryManager.displayBooks();
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
                

        
            default:
                break;
        }

    }

    private static void getBookDetails(){


        System.out.println("Enter book name:");
        String bookName = sc.nextLine();
        System.out.println("Enter book author:");
        String authorName = sc.nextLine();
        System.out.println("Enter book serial number:");
        Long serial = sc.nextLong();
        System.out.println("Enter book quantity:");
        int quantity = sc.nextInt();

        LibraryManager.addBook(serial, bookName, authorName, quantity);

        System.out.println("Book added successfully: " + bookName + quantity);
    }
    
}

package libraryProject;
import libraryProject.UserFunctions;
import java.util.Scanner;

public class Librarian extends User implements UserFunctions {
    static Scanner sc = new Scanner(System.in);

    //COnstructor for librarian class
    public Librarian(String userId) {
        super(userId);
    }

    //Function to show all available options for a librarian
    @Override
    public void userOptions() {
        while (true) {
            System.out.println("--------------------------");
            System.out.println("1)Add a book\n2)Register a student\n3)See students list\n4)Assign a book\n5)Submit a book\n6)Renew a book\n7)Show all books\n8)Change user\nPress 0 to exit:");
            System.out.println("--------------------------");
            int choice = sc.nextInt();
            sc.nextLine();
            //executeOperation(choice);
        }
    }

    //Function to execute operation selected by the user
    // private void executeOperation(int choice) {
    //     switch (choice) {
    //         case 1:
    //             getBookDetails();
    //             break;
    //         case 2:
    //             registerStudent();
    //             break;
    //         case 3:
    //             printStudentList();
                
    //             break;
    //         case 4:
    //             assignBook();
                
    //             break;
    //         case 5:
    //             submitBook();

                
    //             break;
    //         case 6:
    //             renewBook();
                
    //             break;
    //         case 7:
    //             LibraryManager.displayBooks();
    //             break;
    //         case 8:
    //             Library.selectUser();
    //             break;
    //         case 0:
    //             System.exit(0);
    //             break;
    //         default:
    //             System.out.println("Invalid choice!");
    //             break;
    //     }
    // }

    @Override
    public void assignBook() {
        // Logic for assigning a book to the student (considering availability, etc.)
    }

    @Override
    public void submitBook(){

    }
    @Override
    public void renewBook(){
        
    }

    @Override
    public void showAssignedBooks(){
        
    }
    @Override
    public void executeOperation(){
        
    }
    @Override
    public void returnBook(){
        
    }
    @Override
    public void addBookToList(){
        
    }
}

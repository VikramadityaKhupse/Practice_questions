package libraryProject;
import java.util.ArrayList;
import java.util.Scanner;
import libraryProject.UserFunctions;

class Student extends User implements UserFunctions{
    
    public static ArrayList<Book> assignedBooks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    //comctructor for student object
    Student(String username){
    
        super(username);
        LibraryManager.students.add(this);
    
    
    }
    //Function to show all available student options
    @Override
    public void userOptions(){
        
        while (true) {
            System.out.println("1)Take a book\n2)Show available books\n3)Show taken books\n4)Return a book\n5)Renew a book\n8)Change user\n Press 0 to exit:");
            int choice = sc.nextInt();
            //executeOperation(choice);
        }
    
    
    }
    
    // //Function to execute student's operations
    // private void executeOperation(int choice) {
    //     switch (choice) {
    //         case 1:
    //             assignBook();
    //             break;
    //         case 2:
    //             LibraryManager.displayBooks();
    //             break;
    //         case 3:
    //             showAssignedBooks(assignedBooks);
    //             break;
    //         case 4:
    //             System.out.println("Enter book serial number to submit: ");
    //             long choice2 = sc.nextInt();
    //             submitBook(choice2);
    //             break;
    //         case 5:
    //             renewBook();
    //             break;
    //         case 6:
    //             break;
    //         case 7:
    //             LibraryManager.displayBooks();
    //             break;
    //         case 8:
    //             Library.main(null);
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
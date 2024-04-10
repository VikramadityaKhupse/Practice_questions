package libraryProject;
import java.util.ArrayList;
class Student extends User{

    public static ArrayList<Book> assignedBooks = new ArrayList<>();
    
    
    //comctructor for student object
    public Student(username){
    
        super(username);
        LibraryManager.studentsList.add(this);
    
    
    }
    //Function to show all available student options
    public static void userOptions(){
        static Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1)Take a book\n2)Show available books\n3)Show taken books\n4)Return a book\n5)Renew a book\n8)Change user\n Press 0 to exit:");
            int choice = sc.nextInt();
            executeOperation(choice);
        }
    
    
    }
    
    //Function to execute student's operations
    private void executeOperation(int choice) {
        switch (choice) {
            case 1:
                takeBook();
                break;
            case 2:
                LibraryManager.displayBooks();
                break;
            case 3:
                displayBooksTaken(tookBook);
                break;
            case 4:
                System.out.println("Enter book serial number to submit: ");
                long choice2 = sc.nextInt();
                submitBook(choice2);
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
                Library.main(null);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    
    
    
    
    }
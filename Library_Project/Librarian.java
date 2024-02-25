package Library_Project;

import java.util.Scanner;

public class Librarian extends User {
    static Scanner sc = new Scanner(System.in);

    //COnstructor for librarian class
    public Librarian(String userId) {
        super(userId);
    }

    //Function to show all available options for a librarian
    public void librarianOptions() {
        while (true) {
            System.out.println("1)Add a book\n2)Register a student\n3)See students list\n4)Assign a book\n5)Submit a book\n6)Renew a book\n7)Show all books\n8)Change user\n Press 0 to exit:");
            int choice = sc.nextInt();
            executeOperation(choice);
        }
    }
    
    //Functioon to execute operation selected by the user
    private void executeOperation(int choice) {
        switch (choice) {
            case 1:
                getBookDetails();
                break;
            case 2:
                registerStudent();
                break;
            case 3:
                studentList();
                
                break;
            case 4:
                assignBook();
                
                break;
            case 5:
                submitBook();

                
                break;
            case 6:
                renewBook();
                
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

    //Function to take book details and add that book to library
    private static void getBookDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book name:");
        String bookName = sc.nextLine();
        System.out.println("Enter book author:");
        String authorName = sc.nextLine();
        System.out.println("Enter book serial number:");
        long serial = sc.nextLong();
        System.out.println("Enter book quantity:");
        int quantity = sc.nextInt();

        LibraryManager.addBook(serial, bookName, authorName, quantity);

        System.out.println("Book added successfully: " + bookName + ", Quantity: " + quantity);
    }

    //Function to add a new student in Library student list
    public static void registerStudent() {
        System.out.println("Please enter student's SGGS id:");
        String studentId = sc.nextLine();
        Student student = new Student(studentId);
        LibraryManager.addStudent(student);
    }

    //Function to assign a book to a student
    public void assignBook() {
        
        System.out.println("Please enter student's SGGS id:");
        String studentId = sc.nextLine();
        System.out.println("Enter the serial number of the book to assign:");
        long serialNumber = sc.nextLong();
        Book book = LibraryManager.findBookBySerial(serialNumber);
        
        for(Student student : LibraryManager.students){

            if(student.userId == studentId){
                student.addBookToList(book);
            }
        }
    }

    //Function to display registered students list
    public void studentList(){

        for(Student student : LibraryManager.students){

            System.out.println("\n"+student.userId);
        }
    }
    
    //Function to submit a book from student
    public void submitBook(){
        System.out.println("Please enter student's SGGS id:");
        String studentId = sc.nextLine();
        System.out.println("Enter the serial number of the book to submit:");
        long serialNumber = sc.nextLong();

        for(Student student : LibraryManager.students){

            if(student.userId == studentId){
                student.submitBook(serialNumber);
            }else{
                System.out.println("Student not found! or Invalid student ID");
            }
        }

    }
}

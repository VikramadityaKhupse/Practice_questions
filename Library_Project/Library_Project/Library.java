package Library_Project;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    
    
    

    public static void main(String[] args) {
        selectUser();
    }
    
    
    public static void selectUser() {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int choice = 0; 
    
        do {
            try {
                System.out.println("Are you a User or Librarian?\n1 for Student\n2 for Librarian:");
                choice = sc.nextInt();
                sc.nextLine(); 

                if (choice != 0) {
                    validInput = true; 
                    if (choice == 1) {
                        
                        String studentId = askForId();
                        Student student = new Student(studentId);
                        student.studentOptions();
                    } else if (choice == 2) {
                        String librarianId = askForId();
                        Librarian librarian = new Librarian(librarianId);
                        librarian.librarianOptions();
                    } else {
                        System.out.println("Invalid choice!");
                        validInput = false;
                    }
                }
                
            } catch (InputMismatchException e) {
                
                System.out.println("Please enter a valid input (numbers only) ");
                validInput = false;
            }
            catch (LibraryExceptions.InvalidRegistrationIDError e) {
                
                System.out.println(e.getMessage());
                validInput = false;
            }
    
            
        } while (!validInput);
    
        sc.close();
    }
    
   public static String askForId() throws LibraryExceptions.InvalidRegistrationIDError {
    Scanner sc1 = new Scanner(System.in);
    String id;
    do {
        System.out.println("Please enter your SGGS id:");
        id = sc1.nextLine();
        if (CheckValidId.check_reg(id)) {
            
            return id;
        } else {
            throw new LibraryExceptions.InvalidRegistrationIDError("Please enter valid registration ID");
        }
    } while (true);
    
}

    
}

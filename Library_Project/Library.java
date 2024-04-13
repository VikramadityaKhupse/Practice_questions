package Library_Project;

import java.util.Scanner;

import Library_Project.LibraryExceptions.InvalidUserInputException;

public class Library {
    
    
    

    public static void main(String[] args) {
        selectUser();
    }
    
    
    public static void selectUser() {
        
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
    
        do {
            try {
                System.out.println("Are you a User or Librarian?\n1 for Student\n2 for Librarian:");
                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline character after int input
    
                validInput = true; // Input was successful
    
                if (choice == 1) {
                    System.out.println("Please enter your SGGS student id:");
                    String studentId = sc.nextLine();
                    Student student = new Student(studentId);
                    student.studentOptions();
                } else if (choice == 2) {
                    System.out.println("Please enter your SGGS id:");
                    String librarianId = sc.nextLine();
                    Librarian librarian = new Librarian(librarianId);
                    librarian.librarianOptions();
                } else {
                    System.out.println("Invalid choice!");
                }
    
            } catch (InvalidUserInputException e) {
                throw new LibraryExceptions.InvalidUserInputException("Your custom error message");

                sc.nextLine(); 
                validInput = false;
            }
        } while (!validInput); 
    
        sc.close();
    }
}

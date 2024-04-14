package Library_Project;

import java.util.InputMismatchException;
import java.util.Scanner;

import Library_Project.LibraryExceptions.InvalidUserInputException;

public class Library {
    
    
    

    public static void main(String[] args) {
        selectUser();
    }
    
    
    public static void selectUser() {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        Integer choice = null; // Declare choice as null (Integer recommended)
    
        do {
            try {
                System.out.println("Are you a User or Librarian?\n1 for Student\n2 for Librarian:");
                choice = sc.nextInt(); // Now choice stores the integer input
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input (numbers only) ");
                sc.nextLine(); // Consume newline character after int input
                validInput = false;
            }
    
            // Check if choice has a value (not null) before using it
            if (choice != null) {
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
            }
        } while (!validInput);
    
        sc.close();
    }
    
    private static void askForId(int choice){
        
    }
}

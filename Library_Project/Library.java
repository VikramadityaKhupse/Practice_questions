package Library_Project;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.relation.InvalidRelationIdException;
public class Library {
    
    
    

    public static void main(String[] args) {
        selectUser();
    }
    
    
    public static void selectUser() {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        Integer choice = null; 
    
        do {
            try {
                System.out.println("Are you a User or Librarian?\n1 for Student\n2 for Librarian:");
                choice = sc.nextInt(); 
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input (numbers only) ");
                validInput = false;
            }
    
            if (choice != null) {
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
        } while (!validInput);
    
        sc.close();
    }
    
    public static String askForId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your SGGS student id:");
        String id = sc.nextLine();
        if(CheckValidId.check_reg(id)){
            sc.close();
            return id;
        }else{
            sc.close();
            throw new InvalidRelationIdException("Please enter valid registration ID!");
        }
        sc.close();
        return null;

    }
    
}

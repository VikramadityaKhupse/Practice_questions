package libraryProject;
import java.util.Scanner;

class Library{



    public static void main(String[] args) {
        startLibrary();
    }


    private static void startLibrary(){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Are you a User or Librarian?\n1 for Student\n2 for Librarian:");
        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.println("Please enter your SGGS student id:");
            String studentId = sc.nextLine();
            Student student = new Student(studentId);
            student.userOptions();
        } else if (choice == 2) {
            System.out.println("Please enter your SGGS id:");
            String librarianId = sc.nextLine();
            Librarian librarian = new Librarian(librarianId);
            librarian.userOptions();
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();


    }
}
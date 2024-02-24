package Library_Project;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        
        userChoice();
    }

    public static int userChoice() {



        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while (true) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    LibraryManager.displayBooks();
                    break;
                case 2:
                    LibraryManager.renewBook(sc);
                    break;
                case 3:
                    LibraryManager.submitBook(sc);
                    break;
                case 4:
                    LibraryManager.takeBook(sc);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int selectUser(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a User or Librarian?\n1 for Student\n2 for Librarian:");
        int choice = sc.nextInt();
        long studentId, librarianId;
        if(choice == 1){
            System.out.println("Please enter your SGGS student id:");
            studentId = sc.nextLong();
            Student student1 = new Student(studentId);
        }else if(choice == 2){
            System.out.println("Please enter your SGGS id:");
            librarianId = sc.nextLong();
            Librarian librarian1 = new Librarian(librarianId);

        }

        return choice;

    }
}

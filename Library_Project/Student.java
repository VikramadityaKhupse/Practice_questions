package Library_Project;
import java.util.Scanner;

public class Student extends User {

    private Book[] tookBook;
    public Student(long userId) {
        super(userId);
        tookBook = new Book[5];
    }


    public void showBooksTaken(){

        for(Book aBook : tookBook){
            System.out.println(aBook.serialNumber+"\t"+aBook.bookName +"\t"+aBook.author+"\t"+aBook.quantity);

        }

    }
    public void assignBook(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student Id:");
        //Add functionality that will add student in students list in manager class


    }
    
}

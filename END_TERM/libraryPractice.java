package END_TERM;



/**
 * InnerlibraryPratice
 */
interface InnerlibraryPratice {

    void addBook();
    void showBooks();
    default void bookCount(){

    }

    
}

public class libraryPractice{
    int totalBooksCount = 0;
    Book[] bookArray = new Book[100];

    public static void main(String[] args) {

        Student student = new Student();
        Librarian librarian = new Librarian();

        student.addBook();
        System.out.println(student.assignedBooksCount);
        System.out.println( student.assignedBooks[0].author);

        librarian.addBook();
        System.out.println(librarian.totalBooksCount);
        System.out.println( librarian.bookArray[0].author);
        
    }


      
}

class Student implements InnerlibraryPratice{
    int assignedBooksCount = 0;
    Book[] assignedBooks = new Book[5];
    

    public void addBook(){
        Book newBook = new Book("Harry", "Java", 1);
        assignedBooks[assignedBooksCount] = newBook;
        assignedBooksCount++;

    }
    public void showBooks(){}

}

class Librarian extends libraryPractice implements InnerlibraryPratice {
    public void addBook(){

        Book newBook = new Book("Harry","Java", 20);
        bookArray[totalBooksCount] = newBook;
        totalBooksCount++;

    }
    public void showBooks(){}

}



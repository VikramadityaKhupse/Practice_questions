package Library_Project;

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
    
}

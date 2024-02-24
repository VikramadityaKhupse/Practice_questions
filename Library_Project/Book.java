package Library_Project;

public class Book {
    public int serialNumber;
    public String bookName;
    public String author;
    public int quantity;
    
    public Book(int serialNumber, String bookName, String author, int quantity) {
        this.serialNumber = serialNumber;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
    }
}

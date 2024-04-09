package libraryProjectNew;
import java.util.ArrayList;

interface UserFunctions{

public static void assignBook();
public static void renewBook();
public static void showAssignedBooks();
public static void returnBook();


}

class User:UserFunctions{


protected String username;

public User(String username){
	this.username = username;

} 


class Student{

public static ArrayList<Book> assignedBooks = new ArrayList<>();




}




}

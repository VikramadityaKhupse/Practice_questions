package libraryProject;
interface UserFunctions{

public static void assignBook();
public static void renewBook();
public static void showAssignedBooks();
public static void returnBook();
public static void userOptions();



}

class User: UserFunctions{


protected String username;

public User(String username){
	this.username = username;

} 

}

package libraryProject;
interface UserFunctions{

public  void assignBook();
public  void submitBook();
public  void renewBook();
public  void showAssignedBooks();
public  void executeOperation();
public  void returnBook();
public  void userOptions();
public  void addBookToList();



}

class User implements UserFunctions{


protected String username;

public User(String username){
	this.username = username;


	
} 
@Override
  public void assignBook() {
      System.out.println("This functionality is not available for general users.");
  }

@Override
  public void submitBook() {
      System.out.println("This functionality is not available for general users.");
  }
  @Override
  public void renewBook() {
      System.out.println("This functionality is not available for general users.");
  }
  @Override
  public void showAssignedBooks() {
      System.out.println("This functionality is not available for general users.");
  }
  @Override
  public void executeOperation() {
      System.out.println("This functionality is not available for general users.");
  }
  @Override
  public void returnBook() {
      System.out.println("This functionality is not available for general users.");
  }
  @Override
  public void userOptions() {
      System.out.println("This functionality is not available for general users.");
  }
  @Override
  public void addBookToList() {
      System.out.println("This functionality is not available for general users.");
  }
  
}

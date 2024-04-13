package Library_Project;


public class LibraryExceptions extends Exception {

    public LibraryExceptions(String message) {
        super(message); // Call the super constructor with a message
    }

    public static class InvalidUserInputException extends LibraryExceptions{

        public InvalidUserInputException(String message) {
            super(message);
        }

    
    }
    
}

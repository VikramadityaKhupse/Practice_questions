import javax.swing.text.DefaultEditorKit.CutAction;

public class CustomException extends Exception {

    CustomException(String message){

        super(message);
    }
    
}

class ExceptionCheck{

    public static void main(String[] args) {
        
        try{

            validate(16);
        }catch(CustomException e){

            System.out.println(e.getMessage());
        }
        
    }

    public static void validate(int num) throws CustomException{

        if(num <= 18){
            throw new CustomException("Exception Underage!");
        }
    }
}
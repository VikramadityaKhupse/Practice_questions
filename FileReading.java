import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReading {

    public static void main(String[] args) {
        int i = 0;
        try{
        FileReader fr = new FileReader("fun.java");
        while(i < 20){
            System.out.println(Integer.toString(fr.read()));
            i++;
        }
        
        fr.close();
        }
        catch(FileNotFoundException e){


        }
        catch(IOException e){


        }

    }
    
}

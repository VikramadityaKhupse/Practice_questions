import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileReading {

    public static void main(String[] args) {
        try {
            File file = new File("fun.java");
            FileReader fileReader = new FileReader(file);

            int character;
            
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }
    
}

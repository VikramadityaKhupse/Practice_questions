import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Creating a new file
        File file = new File("example.txt");
        
        try {
            // Creating a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Writing to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a file handling example.");
            writer.close();

            // Reading from the file
            FileReader reader = new FileReader(file);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

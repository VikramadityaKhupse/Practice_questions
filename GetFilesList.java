import java.io.File;

public class GetFilesList {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "path/to/your/directory";

        // Create a File object
        File directory = new File(directoryPath);

        // Get all the files and directories
        File[] filesList = directory.listFiles();

        if (filesList != null) {
            for (File file : filesList) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                }
            }
        } else {
            System.out.println("The specified path is not a directory or an error occurred.");
        }
    }
}

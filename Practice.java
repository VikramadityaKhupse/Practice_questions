import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;

public class Practice{

    static int folderCount = 0;
    static int fileCount = 0;
    static int pythonFilesCount = 0;
    static int javaClassFiles = 0;
    static int javaFiles = 0;

    public static void getFilesFolders(String path){

        File file = new File(path);

        File[] fileList = file.listFiles();

        if(fileList != null){

        for (File file2 : fileList) {

            if(file2.isFile()){

                fileCount++;

                if(file2.getName().endsWith(".java")){
                    javaFiles++;
                    System.out.println("Java file: "+ file2.getName());
                }
                if(file2.getName().endsWith(".py")){
                    pythonFilesCount++;
                    System.out.println("Python file: "+ file2.getName());
                }
                if(file2.getName().endsWith(".class")){
                    javaClassFiles++;
                    System.out.println("Java class file: "+ file2.getName());
                }
            }else if(file2.isDirectory()){
                folderCount++;
                
                System.out.println("\nFolder: "+ file2.getName()+"\n");
            }
            
        }
    }else{

        System.out.println("Directory is empty! PLease provide correct directory");
    }


    }

    public static void main(String[] args) {
        String path = "/home/vikramaditya/Desktop/Practice";
        getFilesFolders(path);
        System.out.println("Total Files count: "+ fileCount);
        System.out.println("Total Folders count: "+ folderCount);
        System.out.println("Total Python Files count: "+ pythonFilesCount);
        System.out.println("Total java Files count: "+ javaFiles);
        System.out.println("Total .class Files count: "+ javaClassFiles);
    }

}


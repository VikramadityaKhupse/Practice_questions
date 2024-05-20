import java.io.File;

public class GetFilesList {

    static int filesCount;
    static int foldersCount;
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "/home/vikramaditya/Desktop/Practice";
        //calling the function
        getFilesFolder(directoryPath);
        System.out.println("Total files: " + filesCount);
        System.out.println("Total folders: " + foldersCount);

    }

    public static void getFilesFolder(String path){

        //First create a fie object with given path
        File directory = new File(path);
        //create an array of filesList using .lisFile() method of file object
        File[] filesList = directory.listFiles();
        
        //First we will check if list in not null otherwise we will terminate program
        if(filesList != null){
            //If file is not null we will iterate through each file object in array
            for (File file : filesList){
                //if want to get only .java files, use "file.getName().endsWith(".java")" in if condition"
                if(file.isFile() ){

                    filesCount++;
                    System.out.println("File: " + file.getName());
                
                    //if object is a folder then we will print it specially
                }else if(file.isDirectory()){
                    foldersCount++;
                    System.out.println("Folder: " + file.getName());

                    //we can use same function again to get list of files/folders in this folder
                    //getFilesFolder(file.getAbsolutePath());
                    //can add more code to organize files and folder names correctly.
                }


            }
        } else{

            System.out.println("Maybe path you provided is wrong! Provide correct path.");
        }
    }
}

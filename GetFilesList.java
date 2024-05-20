import java.io.File;

public class GetFilesList {

    static int filesCount;
    static int foldersCount;
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "/home/vikramaditya/Desktop/Practice";
        getFilesFolder(directoryPath);
        System.out.println(filesCount);
        System.out.println(foldersCount);

    }

    public static void getFilesFolder(String path){

        File directory = new File(path);
        File[] filesList = directory.listFiles();

        if(filesList != null){

            for (File file : filesList){
                //if want to get only .java files, use "file.getName().endsWith(".java")" in if condition"
                if(file.isFile() ){

                    filesCount++;
                    System.out.println("File: " + file.getName());
                }else if(file.isDirectory()){
                    foldersCount++;
                    System.out.println("Folder: " + file.getName());
                }


            }
        } else{

            System.out.println("Maybe path you provided is wrong! Provide correct path.");
        }
    }
}

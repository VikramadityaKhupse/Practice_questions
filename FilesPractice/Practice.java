
import java.io.*;
public class Practice{

public static void main(String [] arg)throws Exception{

File file = new File("Folder");

file.createNewFile();
// System.out.println(file.exists());
// System.out.println(file.getPath());
System.out.println(file.getAbsolutePath());
 System.out.println(file.getName());
// System.out.println(file.getParentFile());
// System.out.println(file.canRead());
// System.out.println(file.canWrite());
// System.out.println(file.canExecute());
// System.out.println(file.setExecutable(false));
// System.out.println(file.canExecute());
// File nestedDirs = new File("parentDir/childDir");
//             if (nestedDirs.mkdirs()) {
//                 System.out.println("Nested directories created.");
//             }

System.out.println("File URL: " + file.toURL());
System.out.println("File URI: " + file.toURI());
System.out.println("File separator: " + File.separator);
System.out.println("Path separator: " + File.pathSeparator);










}


}

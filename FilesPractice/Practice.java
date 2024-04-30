
import java.util.Scanner;
import java.io.*;
public class Practice{

public static void main(String [] arg)throws Exception{

File file = new File("Practice_File.txt");

file.createNewFile();
FileWriter fw = new FileWriter(file, true);
fw.write("Hello there");

//System.out.println(file.getName());
//System.out.println(file.getParent());


}


}

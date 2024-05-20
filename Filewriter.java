import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;



public class Filewriter {

    //Code to read text from other file and simultaneously write to other file
    public static void main(String[] args) {
        
        int character;

        File writeFile = new File("File.txt");
        File readFile = new File("fun.java");

        //Always use or create filereader and filewriter object in try catch block as it throws IOException
        try{
        FileWriter fw = new FileWriter(writeFile);
        FileReader fr = new FileReader(readFile);

        while((character = fr.read()) != -1){
            fw.append((char)character);

        }

        
        fw.close();
        fr.close();
        }catch(IOException e){

            System.out.println(e.getMessage());
        }

        
    }
    
}

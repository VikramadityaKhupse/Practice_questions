import javax.swing.JOptionPane;
import java.io.File;

class Gui{


public static void main(String[] args)throws Exception{

File file1 = new File("Practice.txt");
int input = JOptionPane.showConfirmDialog(null, "Want to create a file?", "Confirm", JOptionPane.YES_NO_OPTION);

if(input ==0){

file1.createNewFile();
JOptionPane.showMessageDialog(null,"File " + file1.getName() +" is created!","", JOptionPane.INFORMATION_MESSAGE);
}else{

JOptionPane.showMessageDialog(null,"File is not created","", JOptionPane.INFORMATION_MESSAGE);

}




}


}

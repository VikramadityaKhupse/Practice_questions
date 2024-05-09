import javax.swing.*;
import java.io.File;
import java.awt.FlowLayout;



class Gui extends JFrame{
 JLabel num1JLabel, num2JLabel, resultJLabel;
 JTextField num1TextField, num2TextField, resulTextField;
 JButton addButton;

 public Gui(){

    num1JLabel = new JLabel("NUM1");
    num2JLabel = new JLabel("NUM2");
    resultJLabel = new JLabel("Result");
    num1TextField = new JTextField(20);
    num2TextField = new JTextField(20);
    resulTextField = new JTextField("21");
    
    addButton = new JButton("ADD");
    setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
    add(num1JLabel); add(num1TextField);
    add(num1JLabel); add(num2TextField);
    add(addButton);
    add(resulTextField);
    setSize(getPreferredSize());
    setVisible(rootPaneCheckingEnabled);


    

 }
    

public static void main(String[] args)throws Exception{

// File file1 = new File("Practice.txt");
// int input = JOptionPane.showConfirmDialog(null, "Want to create a file?", "Confirm", JOptionPane.YES_NO_OPTION);

// if(input == 0){

// file1.createNewFile();
// JOptionPane.showMessageDialog(null,"File " + file1.getName() +" is created!","", JOptionPane.INFORMATION_MESSAGE);
// }else{

// JOptionPane.showMessageDialog(null,"File is not created","", JOptionPane.INFORMATION_MESSAGE);

// }

Gui gui1 = new Gui();
//gui1.setVisible(isDefaultLookAndFeelDecorated());




}


}

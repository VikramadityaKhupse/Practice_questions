package GUI_practice;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



class Gui extends JFrame implements ActionListener{
 JLabel inputFieldLabel, num2JLabel, resultJLabel;
 JTextField inputTextField, num2TextField, resulTextField;
 JButton addButton, subButton, divButton, multiButton, factButton, rightParenthesisButton, leftParenthesisButton, enterButton;
 JButton backSpaceButton, circumFleXButton;

 public Gui(){
    setTitle("Calculator");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //Labels
    inputFieldLabel = new JLabel("Input");
    resultJLabel = new JLabel("Result");

    //TextFields
    
    inputTextField = new JTextField(40);
    resulTextField = new JTextField("21");

    //Buttons
    addButton = new JButton("+");
    subButton = new JButton("-");
    divButton = new JButton("/");
    multiButton = new JButton("*");
    leftParenthesisButton = new JButton("(");
    rightParenthesisButton = new JButton(")");
    backSpaceButton = new JButton("<=");
    enterButton = new JButton("=");
    enterButton.addActionListener(this);
    circumFleXButton = new JButton("^"); //not added in gui

    //setting layout
    setLayout(new FlowLayout(FlowLayout.LEFT, 40, 40));
    add(inputFieldLabel); add(inputTextField); add(enterButton); 
    
    add(resulTextField);
    add(addButton); add(subButton); add(divButton); add(multiButton); 
    add(enterButton);
    add(leftParenthesisButton); add(rightParenthesisButton); add(enterButton);
    
    setSize(getPreferredSize());
    setVisible(true);

    //setting up listeners
    


    

 }
 public void actionPerformed(ActionEvent ae){
   if(ae.getSource() == enterButton){
      String infixExpression = inputTextField.getText();
      
   }
		
		String result = "";
		
		resulTextField.setText(result+"");
		
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

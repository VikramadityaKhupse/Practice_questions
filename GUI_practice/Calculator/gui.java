package Calculator;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Gui extends JFrame implements ActionListener {
    JLabel inputFieldLabel, resultJLabel;
    JTextField inputTextField, resulTextField;
    JButton addButton, subButton, divButton, multiButton, enterButton, leftParenthesisButton, rightParenthesisButton;

    public Gui() {
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Labels
        inputFieldLabel = new JLabel("Input");
        resultJLabel = new JLabel("Result");

        // TextFields
        inputTextField = new JTextField(40);
        resulTextField = new JTextField(40);
        resulTextField.setEditable(false);

        // Buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        multiButton = new JButton("*");
        leftParenthesisButton = new JButton("(");
        rightParenthesisButton = new JButton(")");
        enterButton = new JButton("=");
        enterButton.addActionListener(this);

        // Setting layout
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        add(inputFieldLabel);
        add(inputTextField);
        add(enterButton);
        add(resultJLabel);
        add(resulTextField);
        add(addButton);
        add(subButton);
        add(divButton);
        add(multiButton);
        add(leftParenthesisButton);
        add(rightParenthesisButton);

        // Set preferred size and visibility
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == enterButton) {
            String infixExpression = inputTextField.getText();
            String infixToPostfix = InfixToPostfix.infixToPostfix(infixExpression);
            resulTextField.setText(PostfixEvaluation.evaluatePostfix(infixToPostfix) + "");
        }
    }

    public static void main(String[] args) {
        new Gui();
    }
}

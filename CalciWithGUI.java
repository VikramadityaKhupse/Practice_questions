import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;



public class CalciWithGUI {

    // Method Overloading for Division
    public static int ADD(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static float ADD(float a, float b) {
        return a / b;
    }

    // Static Input
    static void staticInput() {
        int A = 10;
        int B = 2;
        System.out.println("Static Input Division of " + A + " and " + B + " is: " + ADD(A, B));
    }

    // Command Line Input
    static void commandLineInput(String[] args) {
        try {
            int A = Integer.parseInt(args[0]);
            int B = Integer.parseInt(args[1]);
            System.out.println("Command Line Input Division of " + A + " and " + B + " is: " + ADD(A, B));
        } catch (ArithmeticException e) {
            System.out.println("Command Line Input Error: Division by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Command Line Input Error: Invalid number format.");
        }
    }

    // Dynamic Input from the User
    static void dynamicInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer (A): ");
        int A = scanner.nextInt();
        System.out.print("Enter second integer (B): ");
        int B = scanner.nextInt();
        try {
            System.out.println("Dynamic Input Division of " + A + " and " + B + " is: " + ADD(A, B));
        } catch (ArithmeticException e) {
            System.out.println("Dynamic Input Error: Division by zero.");
        }
    }

    // Constructor Input
    static class ConstructorInput {
        ConstructorInput(int A, int B) {
            try {
                System.out.println("Constructor Input Division of " + A + " and " + B + " is: " + ADD(A, B));
            } catch (ArithmeticException e) {
                System.out.println("Constructor Input Error: Division by zero.");
            }
        }
    }

    // GUI for displaying results
    static void createAndShowGUI() {
        JFrame frame = new JFrame("Division Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel labelA = new JLabel("Enter first number (A):");
        labelA.setBounds(10, 20, 160, 25);
        panel.add(labelA);

        JTextField textA = new JTextField(20);
        textA.setBounds(180, 20, 165, 25);
        panel.add(textA);

        JLabel labelB = new JLabel("Enter second number (B):");
        labelB.setBounds(10, 50, 160, 25);
        panel.add(labelB);

        JTextField textB = new JTextField(20);
        textB.setBounds(180, 50, 165, 25);
        panel.add(textB);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 80, 150, 25);
        panel.add(calculateButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 110, 300, 25);
        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int A = Integer.parseInt(textA.getText());
                    int B = Integer.parseInt(textB.getText());
                    int result = ADD(A, B);
                    resultLabel.setText("Division of " + A + " and " + B + " is " + result);
                } catch (ArithmeticException ex) {
                    resultLabel.setText("Error: Division by zero.");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Invalid number format.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Static Input
        staticInput();

        // Command Line Input
        if (args.length == 2) {
            commandLineInput(args);
        }

        // Dynamic Input
        dynamicInput();

        // Constructor Input
        new ConstructorInput(15, 3);

        // GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
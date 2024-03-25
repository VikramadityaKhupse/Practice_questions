import java.util.Scanner;

public class Practical6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Practical6 calculator = new Practical6();
        
        do {
            System.out.println("Enter value of a:");
            double a = scanner.nextDouble();
            
            System.out.println("Enter value of b:");
            double b = scanner.nextDouble();
            
            System.out.println("Choose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.addition(a, b));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtraction(a, b));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiplication(a, b));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.division(a, b));
                    break;
                case 5:
                    System.out.println("Exiting calculator...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                
                scanner.close();
            }
        } while (true);
    }
    
    public double addition(double a, double b) {
        return a + b;
    }
    
    public double subtraction(double a, double b) {
        return a - b;
    }
    
    public double multiplication(double a, double b) {
        return a * b;
    }
    
    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }
}

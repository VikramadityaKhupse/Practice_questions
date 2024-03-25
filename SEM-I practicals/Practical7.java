import java.util.Scanner;

class Bank {

    private String user_name, check_name;
    private int choice, flag = 0, num = 0, pin;
    private long current_bal = 0, fixed_depo = 0, debit_amount = 0, credit_amount = 0 ,mobile_num;
    private Scanner scanner = new Scanner(System.in);

    public void takeDetails() {
        System.out.println("WELCOME TO STATE BANK OF INDIA!");
        System.out.print("Enter your name: ");
        user_name = scanner.next();
        System.out.print("Enter your mobile number: ");
        mobile_num = scanner.nextLong();
        newPin();
        chooseAction();
    }

    public void confirmPin(int num) {
        System.out.print("Confirm your pin: ");
        num = scanner.nextInt();
        while (num != pin) {
            System.out.print("\nPlease enter correct pin: ");
            num = scanner.nextInt();
        }
    }

    public void newPin() {
        System.out.print("\nEnter your new pin: ");
        pin = scanner.nextInt();
        confirmPin(num);
        System.out.println("New pin generated successfully");
        chooseAction();
    }

    public void chooseAction() {
        while (flag == 0) {
            System.out.println("________________________________________________________________");
            System.out.println("\nPlease select action below:\n1) Add money\n2) Withdraw money\n3) Show balance\n4) Exit\nEnter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMoney();
                    break;

                case 2:
                    withdraw();
                    break;
                case 3:
                    System.out.println("\nYour current balance is: " + current_bal);
                    break;
                case 4:
                    flag = 1;
                    break;

                default:
                    flag = 1;
                    break;
            }
        }
    }

    public void addMoney() {
        System.out.print("Confirm your name: ");
        check_name = scanner.next();
        while (!check_name.equals(user_name)) {
            System.out.print("Name didn't match. Please try again: ");
            check_name = scanner.next();
        }
        while (credit_amount < 2000) {
            System.out.print("Enter amount to add (min 2000rs): ");
            credit_amount = scanner.nextLong();
        }
        confirmPin(num);
        current_bal += credit_amount;
        System.out.println("Amount added successfully!");
    }

    public void withdraw() {
        System.out.print("\nPlease enter your name: ");
        check_name = scanner.next();
        while (!check_name.equals(user_name)) {
            System.out.print("Name didn't match. Please try again: ");
            check_name = scanner.next();
        }

        System.out.print("Enter amount to withdraw: ");
        debit_amount = scanner.nextLong();
        if (debit_amount > current_bal) {
            System.out.println("BANK BALANCE LOW!!");
        } else {
            current_bal -= debit_amount;
            System.out.println(debit_amount + " rupees withdrawn. Please collect your cash.");
        }
    }

    public static void main(String[] args) {
        Bank user1 = new Bank();
        user1.takeDetails();
    }
}

import java.util.Scanner;

public class BankAccountEncapsulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("To open an account, please make an initial deposit:");
        double initialAmount = sc.nextDouble();

        BankAccount userAccount = new BankAccount(initialAmount);

        while (true) {  // Loop to allow multiple transactions
            System.out.println("\nPlease select the action you want to perform:");
            System.out.println("1. Withdrawal\n2. Deposit\n3. Check Balance\n4. Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the amount to be withdrawn:");
                    double withdrawAmount = sc.nextDouble();
                    boolean success = userAccount.withdraw(withdrawAmount);
                    if (success) {
                        System.out.println("Please collect your cash. Your new balance is: " + userAccount.getBalance());
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the amount to be deposited:");
                    double newBalance = userAccount.deposit(sc.nextDouble());
                    System.out.println("Your amount has been deposited. New balance: " + newBalance);
                    break;

                case 3:
                    System.out.println("Your Account Balance is: " + userAccount.getBalance());
                    break;

                case 4:
                    System.out.println("Thanks for banking with us. See you soon!");
                    sc.close();  // Close scanner before exiting
                    return;  // Exit the program

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    // Constructor with validation
    public BankAccount(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
    }

    // Deposit method with validation
    public double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
        return this.balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Withdraw method with balance check
    public boolean withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            return true;
        } else {
            return false;
        }
    }
}

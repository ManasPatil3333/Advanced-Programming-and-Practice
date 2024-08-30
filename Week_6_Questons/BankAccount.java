public class BankAccount {
    // Private attributes
    private String accountNumber;
    private double balance;
    private static final double MIN_BALANCE = 0.0; // Constant for the minimum balance allowed

    // Constructor to initialize the account
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= MIN_BALANCE) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Initial balance cannot be less than the minimum allowed balance.");
        }
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= MIN_BALANCE) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Withdrawal amount exceeds the balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Creating a bank account with an initial balance
        BankAccount account = new BankAccount("123456789", 500.00);

        // Display account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Performing some transactions
        account.deposit(200.00); // Deposit funds
        account.withdraw(100.00); // Withdraw funds
        account.withdraw(600.00); // Attempt to withdraw more than available balance
    }
}

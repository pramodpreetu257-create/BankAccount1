public class BankService {
    private double balance;

    // Constructor
    public BankService(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Main method to test
    public static void main(String[] args) {
        BankService account = new BankService(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Final Balance: " + account.getBalance());
    }
}

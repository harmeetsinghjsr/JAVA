class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); 
    }
}

class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = startingBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Withdrawal of " + amount + " denied for " + owner +
                ". Current balance is only " + balance + "."
            );
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Harmeet", 1000.0);

        try {
            account.deposit(500.0);
            account.withdraw(200.0);     
            account.withdraw(2000.0);    
        } catch (InsufficientFundsException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
package Assignment.Lab3;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
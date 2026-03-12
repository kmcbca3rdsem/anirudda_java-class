package Assignment.Lab3;

interface Bank {
    void displayBalance();
}

class SavingAccount implements Bank {
    private double balance;

    SavingAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void displayBalance() {
        System.out.println("Saving Account Balance: " + balance);
    }
}

public class BankInterfaceDemo {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(5000.50);
        sa.displayBalance();
    }
}
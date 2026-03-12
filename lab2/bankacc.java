package lab2;

public class bankacc {
    private String accno;
    private String name;
    private double balance;

    public bankacc(String accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
    
}

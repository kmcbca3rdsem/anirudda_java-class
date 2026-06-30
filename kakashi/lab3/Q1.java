package kakashi.lab3;

import java.util.Scanner;

class BankAccount {
    int accNumber;
    String name;
    double balance;

    BankAccount(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }
}

class Bank {
    void verifyAccount(BankAccount acc) {
        if (acc.balance >= 1000) {
            System.out.println("Account is Active");
        } else {
            System.out.println("Account is Inactive");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Balance:");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accNumber, name, balance);
        Bank bank = new Bank();

        bank.verifyAccount(acc);
    }
}
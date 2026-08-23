import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double getBalance();
}

abstract class Account implements BankService {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    abstract double interest();
}

class SavingsAccount extends Account {
    SavingsAccount(int no, String name, double balance) {
        super(no, name, balance);
    }

    double interest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int no, String name, double balance) {
        super(no, name, balance);
    }

    double interest() {
        return balance * 0.02;
    }
}

public class OnlineBanking {
    public static void main(String[] args) {

        Account a1 = new SavingsAccount(101, "Nikhil", 10000);
        Account a2 = new CurrentAccount(102, "Rahul", 5000);

        try {
            a1.deposit(2000);
            a1.withdraw(1000);

            a1.withdraw(2000);
            a2.deposit(2000);

            System.out.println("Nikhil Balance: " + a1.getBalance());
            System.out.println("Rahul Balance: " + a2.getBalance());

            System.out.println("Savings Interest: " + a1.interest());
            System.out.println("Current Interest: " + a2.interest());

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
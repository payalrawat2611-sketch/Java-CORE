/*
 # Project - Bank Account System using Abstraction

 --> Abstraction is used to hide the internal implementation
     and show only the required operations.

 --> Different bank accounts can implement
     the same operations in different ways.
 */


// Abstract Class

abstract class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract methods

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    // Normal method

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}


// Child class

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited in Savings Account: " + amount);
    }

    @Override
    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn from Savings Account: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}


// Child class

class CurrentAccount extends BankAccount {

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited in Current Account: " + amount);
    }

    @Override
    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Amount withdrawn from Current Account: " + amount);
    }
}


// Main class

public class project_abstraction {

    void main() {

        System.out.println("===== Savings Account =====");

        BankAccount account1 =
                new SavingsAccount("Payal", 10000);

        account1.displayBalance();

        account1.deposit(5000);
        account1.withdraw(3000);

        account1.displayBalance();


        System.out.println();


        System.out.println("===== Current Account =====");

        BankAccount account2 =
                new CurrentAccount("Rahul", 20000);

        account2.displayBalance();

        account2.deposit(10000);
        account2.withdraw(5000);

        account2.displayBalance();
    }
}
public class encapsulation_project {
    /*
     ->  OOP Project - Bank Account Management System
     -> Concept Used :  Encapsulation
     >>> Encapsulation means keeping data private and providing controlled access through methods.
     */

    class BankAcc {

        // Private data members
        private String accountHolder;
        private long accountNumber;
        private double balance;

        // Constructor
        BankAcc(String accountHolder, long accountNumber, double balance) {

            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;

            if (balance >= 0) {
                this.balance = balance;
            } else {
                this.balance = 0;
            }
        }

        // Getter for account holder
        public String getAccountHolder() {
            return accountHolder;
        }

        // Setter for account holder
        public void setAccountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
        }

        // Getter for account number
        public long getAccountNumber() {
            return accountNumber;
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }

        // Deposit money
        public void deposit(double amount) {

            if (amount > 0) {
                balance = balance + amount;
                System.out.println("₹" + amount + " deposited successfully.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Withdraw money
        public void withdraw(double amount) {

            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance = balance - amount;
                System.out.println("₹" + amount + " withdrawn successfully.");
            }
        }

        // Display account details
        public void displayAccountDetails() {

            System.out.println("\n--- Account Details ---");
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        }
        void main() {

            // Creating account
            BankAcc account =
                    new BankAcc("Payal", 1234567890L, 10000);

            // Display initial details
            account.displayAccountDetails();

            System.out.println();

            // Deposit money
            account.deposit(5000);

            // Withdraw money
            account.withdraw(2000);

            // Display updated details
            account.displayAccountDetails();

            System.out.println();

            // Testing validation
            account.withdraw(20000);

            account.deposit(-500);
        }
    }
}

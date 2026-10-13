
import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money
    void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Check balance
    double checkBalance() {
        return balance;
    }

    // Display account details
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Final Balance: " + checkBalance());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, name, balance);

        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        acc.displayAccount();

        sc.close();
    }
}
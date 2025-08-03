package oops;

// Main.java
import java.util.*;

abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method - abstraction
    public abstract void calculateInterest();

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// Inheritance & Method Overriding
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // super constructor
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest (Savings): ₹" + interest);
    }
}

// Another child class
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " (Current Account). Balance: ₹" + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current account does not earn interest.");
    }
}

// Interface - abstraction + multiple inheritance
interface Insurance {
    void provideInsurance();
}

// Using interface in class
class PremiumSavingsAccount extends SavingsAccount implements Insurance {
    private final String insuranceProvider = "HDFC Life";

    public PremiumSavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance, interestRate);
    }

    @Override
    public void provideInsurance() {
        System.out.println("Insurance provided by: " + insuranceProvider);
    }
}

// Utility class with static method
class AccountUtils {
    public static void printWelcomeMessage() {
        System.out.println("----- Welcome to Java Bank -----");
    }
}

// Main class
public class gpt_ex {
    public static void main(String[] args) {
        AccountUtils.printWelcomeMessage(); // Static method

        Scanner sc = new Scanner(System.in);

        // Polymorphism using parent reference
        BankAccount acc1 = new SavingsAccount("SA123", "Alice", 10000, 5);
        acc1.showDetails();
        acc1.deposit(2000);
        acc1.calculateInterest();

        System.out.println();

        BankAccount acc2 = new CurrentAccount("CA456", "Bob", 5000, 2000);
        acc2.showDetails();
        acc2.withdraw(6500); // Uses overdraft
        acc2.calculateInterest();

        System.out.println();

        PremiumSavingsAccount acc3 = new PremiumSavingsAccount("PSA789", "Charlie", 20000, 6);
        acc3.showDetails();
        acc3.provideInsurance(); // Interface method
        acc3.calculateInterest();

        sc.close();
    }
}


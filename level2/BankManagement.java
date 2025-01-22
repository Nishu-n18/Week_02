package level2;

import java.util.ArrayList;
import java.util.List;

// Account Class
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added for " + name + ": " + account.getAccountNumber());
    }

    public void viewBalance() {
        System.out.println("Balance details for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account: " + account.getAccountNumber() + " | Balance: " + account.getBalance());
        }
    }
}

// Bank Class
class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("New customer added: " + customer.getName());
    }

    public void openAccount(String customerName, String accountNumber, double initialDeposit) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                Account account = new Account(accountNumber, initialDeposit);
                customer.addAccount(account);
                System.out.println("Account opened: " + accountNumber + " for customer: " + customerName);
                return;
            }
        }
        System.out.println("Customer not found: " + customerName);
    }
}

// Main Class
public class BankManagement {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Punjab National Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Open accounts for customers
        bank.openAccount("Alice", "ACC149", 500.0);
        bank.openAccount("Alice", "ACC150", 1500.0);
        bank.openAccount("Bob", "ACC151", 1000.0);

        // View balances
        customer1.viewBalance();
        customer2.viewBalance();

        // Deposit and withdraw operations
        customer1.addAccount(new Account("ACC126", 200.0)); // Adding another account
        customer1.viewBalance();
    }
}

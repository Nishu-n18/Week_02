package Level2;
import java.util.*;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    Scanner s=new Scanner(System.in);

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }// Method for depositing
    public double depositMoney() {
        System.out.println("Enter depositing amount");
        double money = s.nextDouble();
        return (balance=balance+money);
    }//method for withdrawing money
    public double withDrawing() {
        System.out.println("Enter amount to be withdraw");
        double withdrawAmount = s.nextDouble();
        if (balance > withdrawAmount) {
            return balance = balance - withdrawAmount;

        }
        return withdrawAmount;
    }




    // Method to display current balance details
    void displayDetails() {
        System.out.println("Current balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String accountHolder=sc.next();
        int accountNumber= sc.nextInt();
        double balance=sc.nextDouble();
        BankAccount obj=new BankAccount(accountHolder,accountNumber,balance);
        obj.depositMoney();
        obj.withDrawing();
        obj.displayDetails();
    }
}

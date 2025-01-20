package Level1;

public class BankAccount {
    static String bankName="PNB" ;//static variable
    String accountHolderName;
    final int accountNumber;//final variable
      static int totalAccounts=0;
      //Constructor
    BankAccount(String accountHolderName,final int accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    //static method to find total accounts
     static void getTotalAccounts(){
        System.out.println("Total accounts: " + totalAccounts);
    }
    //method to display details
    public void displayDetails(){
        //check if an account object is an instance of BankAccount
        if(this instanceof BankAccount){
            System.out.println("bank name: " + bankName);
            System.out.println("Account holder name: " + accountHolderName);
            System.out.println("Account number: "+ accountNumber);
        }else{
            System.out.println(" Not a valid account");
        }
    }
    public static void main(String[] args) {
        //create objects
        BankAccount account1=new BankAccount("Nishu", 14990);
        BankAccount account2=new BankAccount("Shaili", 2654);
        //calling display method by using object
        account1.displayDetails();
        account2.displayDetails();
       //calling static method by using class
       BankAccount.getTotalAccounts();
    }
}

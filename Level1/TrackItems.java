package Level1;
import java.util.Scanner;

class Items{
    //attributes
    int itemCode;
    String itemName;
    double price;
    int quantity;
    //constructor
    Items(int itemCode, String itemName,double price,int quantity){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;

    }
    //method to calculate total price
    public  double calculatePrice(){
        return quantity*price;

    }
    //display method
    void displayDetails(){
        System.out.println( " code: "+ itemCode +", Name: "+ itemName+ ",price: "+ price + " total Price for " + quantity+ " is: " + calculatePrice());
    }
}
public class TrackItems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int itemCode=sc.nextInt();
        String itemName=sc.next();

        double price=sc.nextDouble();
        int quantity=sc.nextInt();
        //creating an object for Items class
       Items obj=new Items(itemCode,itemName ,price,quantity);
        obj.displayDetails();
    }


}

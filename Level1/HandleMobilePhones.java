package Level1;
import java.util.Scanner;

class MobilePhone{
    //Attributes
    String brand;
    String model;
    double price;
    //Constructor
    MobilePhone(String brand,String model, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    //Display method
    void displayDetails(){
        System.out.println("Brand of phone: " +brand + ", Model name: " +model +", Price: "+ price);
    }
}
public class HandleMobilePhones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take inputs from users
        String brand = sc.next();
        String model = sc.next();
        double price = sc.nextInt();
        //Create object for MobilePhone class
        MobilePhone obj = new MobilePhone(brand, model, price);
        obj.displayDetails();
    }
}

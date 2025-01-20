package Level1;

public class Product {
    static int discount=10;//static variable
    String productName;
    double price;
    final int productId;//final variable
    int quantity;
    //static method to update discounts
    static void updateDiscount(int newDiscount){
        discount=newDiscount;

    }
    //constructor
    Product(String productName,double price,final int productId,int quantity){
        this.productName=productName;
        this.price=price;
        this.productId=productId;
        this.quantity=quantity;
    }
    //method to display details
    void displayDetails(){
        //check if an object is an instance of Product
        if(this instanceof Product) {
            double finalPrice =price-(price*discount/100);
            System.out.println("Product name:" + productName);
            System.out.println("Product price: " + price);
            System.out.println("Id:" + productId);
            System.out.println("Discount: " +discount);
            System.out.println("Quantity: " + quantity);
            System.out.println("Final price: " +finalPrice);
        }
    }

    public static void main(String[] args) {
        //create objects
        Product obj=new Product("Biscuit",10,1,4);
        Product obj1=new Product("Chocolate",100,2,3);
        //calling display method by using object
        obj.displayDetails();
        obj1.displayDetails();
        //calling updated discount method by using class
        Product.updateDiscount(20);
        System.out.println("After update ");
        //Display after update
        obj.displayDetails();
        obj1.displayDetails();
    }
}

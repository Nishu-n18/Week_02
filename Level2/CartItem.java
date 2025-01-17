package Level2;

public class CartItem {
    //Attributes
    String itemName;
    double price;
    int quantity;
    double cost=00.00;
    //Method to add item
    public double AddItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
        cost=cost+quantity*price;
        return cost;
    }
    //Method to remove an item
    public double RemoveItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
        cost=cost-quantity*price;
        return cost;
    }
    //Method to display total cost
    public void TotalCost(){
        System.out.println("Total cost "+cost);
    }
    public static void main(String[] args) {
        CartItem obj=new CartItem();
        obj.AddItem("phone", 100000, 4);
        obj.RemoveItem("phone", 100000, 2);
        obj.TotalCost();
    }
}
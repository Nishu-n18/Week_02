package level1;
class Vehicle{
    protected int maxSpeed;
    protected String fuelType;
    //Constructor
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    //Method to display info
    void displayInfo(){
        System.out.println("MaxSpeed: "+maxSpeed +" FuelType: "+fuelType);
    }
}
class Car extends Vehicle{
    protected int seatCapacity;
    //Constructor

    Car(int maxSpeed, String fuelType,int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    //Method to display info
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("seat Capacity "+ seatCapacity);
    }
}
class Truck extends Vehicle{
    protected int seatCapacity;
    //Constructor

    Truck(int maxSpeed, String fuelType,int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    //Method to display info
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat capacity "+seatCapacity);
    }

}
class Motorcycle extends Vehicle{
    protected int seatCapacity;
    //Constructor
    Motorcycle(int maxSpeed, String fuelType,int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    //Method to display info
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println(" Seat capacity "+seatCapacity);
    }
}
//Main class
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        //create an array that store the object of subclasses
        Vehicle vehicle[]=new Vehicle[3];
        vehicle[0]=new Car(100,"Diesel",6);
        vehicle[1]=new Truck(80,"Petrol",3);
        vehicle[2]=new Motorcycle(120,"Petrol",2);
        System.out.println("Car details");
        vehicle[0].displayInfo();
        System.out.println("Truck details");
        vehicle[1].displayInfo();
        System.out.println("Motorcycle details");
        vehicle[2].displayInfo();
    }
}

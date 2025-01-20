package Level1;

public class Vehicle {
    static int registrationFee=200;//static variable
    String ownerName;
    String vehicleType;
    final int registrationNumber;//final variable
    //static method to update registration fee
    static void updateRegistrationFee(int newRegistrationFee){
        registrationFee=newRegistrationFee;
    }
    //constructor
    Vehicle(String ownerName,String vehicleType,final int registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;

    }
    //method to display details
    void displayDetails(){
        //check if an  object is an instance of Vehicle
        if(this instanceof Vehicle) {
            System.out.println("Owner name:" + ownerName);
            System.out.println("Vehicle type: " + vehicleType);
            System.out.println("registration number " + registrationNumber);
            System.out.println("Registration fee " +registrationFee);
        }
    }

    public static void main(String[] args) {
        //create objects
        Vehicle obj=new Vehicle("Nishu","Innova",2344);
        Vehicle obj1=new Vehicle("Shobhit","Thar",7468);
        //calling display method by using object
        obj.displayDetails();
        obj1.displayDetails();
        System.out.println("Updated registration fee " );
        //calling updated registration fee
        Vehicle.updateRegistrationFee(500);
        //Display after update
        obj.displayDetails();
        obj1.displayDetails();
    }
}



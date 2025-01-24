package level1;
class Device{
    protected int deviceId;
    protected String status;
    //Constructor
    Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    //Method to display status
    void displayStatus(){
        System.out.println("Device id: "+ deviceId+ " Status: "+ status);
    }
}
//subclass thermostat of class device
class Thermostat extends Device{
    private double temperatureSetting;
    //Constructor

    Thermostat(int deviceId, String status,double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }
    //Method to display status
    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature setting: "+ temperatureSetting);
    }
}
//Main class
public class SmartHomeDevices {
    public static void main(String[] args) {
        //create an object
        Thermostat thermostat=new Thermostat(12,"Active",32.5);
        //display status
        thermostat.displayStatus();
    }
}

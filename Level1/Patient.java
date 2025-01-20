package Level1;

public class Patient {
    static String hospitalName="Ford hospital";//static variable
    String name;
    int age;
    String ailment;
    final int patientId;//final variable
    static int totalPatients=0;
    //static method to find total patients
    static void displayTotalPatients(){
        System.out.println("Total Patients: " + totalPatients);
    }
    // constructor
    Patient(String name,int age,String ailment,final int patientId){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientId=patientId;
        totalPatients++;
    }
    //method to display details
    void displayPatientDetails(){
        //check if an object is an instance of Patient
        if(this instanceof Patient){
            System.out.println(hospitalName);
            System.out.println("Patient name: "+ name);
            System.out.println("Patient id: "+ patientId);
            System.out.println("Ailment: "+ ailment);
        }else{
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        //create objects
        Patient one=new Patient("xyz",18,"appendix",123);
        Patient second=new Patient("abc", 43,"liverdisease",234);
        //calling display method by using object
        one.displayPatientDetails();
        second.displayPatientDetails();
        //calling static method by using class
        Patient.displayTotalPatients();
    }

}





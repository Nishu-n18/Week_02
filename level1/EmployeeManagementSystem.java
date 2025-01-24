package level1;
class Employee{
    protected String name;
    protected int id;
    protected double salary;
    //Constructor
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    //Method to display details
    void displayDetails(){
        System.out.println("Name: " + name + " Id: " + id + " Salary: " + salary);
    }
}
//subclass Manager
class Manager extends Employee{
    int teamSize;
    //Constructor

    Manager(String name, int id, double salary,int teamSize) {
        super(name, id, salary);
        this.teamSize=teamSize;
    }
    //Method to display details
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("TeamSize: " + teamSize);
    }
}
//subclass developer that extend employee class
class Developer extends Employee{
    String programmingLanguage;
    //Constructor

    Developer(String name, int id, double salary,String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }
    //Method to display details
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming language: " + programmingLanguage );
    }
}
//subclass intern
class Intern extends Employee{
    //Constructor
    Intern(String name, int id, double salary) {
        super(name, id, salary);
    }
    //Method to display details
    @Override
    void displayDetails(){
        super.displayDetails();
    }

}
//Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        //object of employee class
        Employee employee=new Employee("Nishu",123,40000);
        //object of manager class
        Manager manager=new Manager("Shobhit",345,60000,4);
        //object of developer class
        Developer developer=new Developer("Nimish",235,55000,"java");
        //object of intern class
        Intern intern=new Intern("Shaili",333,20000);
        System.out.println("Employee details");
        //display details
        employee.displayDetails();
        System.out.println("Manager details");
        manager.displayDetails();
        System.out.println("Developer details");
        developer.displayDetails();
        System.out.println("Intern details");
        intern.displayDetails();
    }
}

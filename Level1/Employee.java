package Level1;

public class Employee {
    static String companyName="Capgemini";//static variable
    String name;
    final int id;//final variable
    String designation;
    static int totalEmployees=0;
    //static method to find total employees
    static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployees);
    }
    //constructor
    Employee(String name,final int id, String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }
    //method to display details
    void displayEmployeeDetails(){
        //check if an object is an instance of Employee
        if(this instanceof Employee){
            System.out.println(companyName);
            System.out.println("Employee name: "+ name);
            System.out.println("employee id: "+ id);
            System.out.println("Designation: "+ designation);
        }else{
            System.out.println("Not from this company");
        }
    }

    public static void main(String[] args) {
        //create objects
        Employee one=new Employee("Nishu",12,"Analyst");
        Employee second=new Employee("Nimish", 13,"Analyst");
        //calling display method by using object
        one.displayEmployeeDetails();
        second.displayEmployeeDetails();
        //calling static method by using class
        Employee.displayTotalEmployees();
    }

}

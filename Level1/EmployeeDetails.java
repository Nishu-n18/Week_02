package Level1;

import java.util.Scanner;

class Employee{
    //Attributes
    String name;
    int id;
    double salary;
    //constructor
    Employee(String name, int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }//display method
    void displayDetails(){
        System.out.println("Employee name: " +name + ", id: " + id + ", Salary: " + salary);
    }

}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int id=sc.nextInt();
        double salary=sc.nextDouble();
        //creating an object for employee class
        Employee employee=new Employee(name, id ,salary);
        employee.displayDetails();
    }

}

package level2;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
        }
    }

    public void clearEmployees() {
        employees.clear();
    }
}
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyInfo() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }

    public void clearCompany() {
        for (Department department : departments) {
            department.clearEmployees();
        }
        departments.clear();
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Capgemini");

        // Create departments
        Department itDept = new Department("IT Department");
        Department hrDept = new Department("HR Department");

        // Add employees to IT department
        itDept.addEmployee(new Employee("Nishu", 101));
        itDept.addEmployee(new Employee("Shobhit", 102));

        // Add employees to HR department
        hrDept.addEmployee(new Employee("Shaili", 201));
        hrDept.addEmployee(new Employee("Vishal", 202));

        // Add departments to the company
        company.addDepartment(itDept);
        company.addDepartment(hrDept);

        // Display company information
        System.out.println("Before Deleting Company:");
        company.displayCompanyInfo();

        // Delete the company and its associated data
        company.clearCompany();
        System.out.println("\nAfter Deleting Company:");
        company.displayCompanyInfo(); // Should display nothing
    }
}
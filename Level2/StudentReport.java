package Level2;
import java.util.*;
class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String studentGrade(){
        if(marks>=80){
            return "A";
        }else if(marks>=70){
            return "B";
        }else if(marks>=60){
            return "C";
        }else if(marks>=50){
            return "D";
        }else if(marks>=40){
            return "E";
        }else{
            return "Fail";
        }

    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks +" Grade of students: " + studentGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int rollNumber=sc.nextInt();
        int marks=sc.nextInt();
        Student obj=new Student(name,rollNumber,marks);
        obj.displayDetails();
    }
}

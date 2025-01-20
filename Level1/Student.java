package Level1;

public class Student {
    static String universityName="Tit";//static variable
    String name;
    final int rollNumber;//final variable
    char grade;
    static int totalStudents=0;
    //static method to find total students
    static void displayTotalStudents(){
        System.out.println("Total Students: " + totalStudents);
    }
    //constructor
    Student(String name,final int rollNumber, char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }
    //method to display details
    void displayStudentDetails(){
        //check if an object is an instance of Student
        if(this instanceof Student){
            System.out.println(universityName);
            System.out.println("Student name: "+ name);
            System.out.println("Student id: "+ rollNumber);
            System.out.println("Grade: "+ grade);
        }else{
            System.out.println("Not from this university");
        }
    }

    public static void main(String[] args) {
        //create objects
        Student one=new Student("Nishu",72,'A');
        Student second=new Student("Shaili", 103,'A');
        //calling display method by using object
        one.displayStudentDetails();
        second.displayStudentDetails();
        //calling static method by using class
        Student.displayTotalStudents();
    }

}



package Level1;

import java.util.Scanner;

class Circle{
    //attributes
    double radius;
    //constructor
    Circle(double radius){
        this.radius=radius;
    }
    //method to calculate circumference
    public  double calculateCircumference(){
        return 2*Math.PI*radius;

    }
    //method to calculate area of circle
    public  double calculateArea(){
        return Math.PI*radius*radius;

    }//display method
    void displayDetails(){
        System.out.println("Circumference of circle: " + calculateCircumference()  +  ", Area of circle: " + calculateArea() );
    }
}
public class ComputeAreaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        //create an object for circle class
        Circle calculate=new Circle(radius);
        calculate.calculateCircumference();
        calculate.calculateArea();
        calculate.displayDetails();
    }
}

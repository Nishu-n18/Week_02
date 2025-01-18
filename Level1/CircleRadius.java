package Level1;

import java.util.Scanner;

class Circle{
    //attributes
    double radius;
    //Default constructor
    Circle(){
        radius=5;
    }
    // Parameterized constructor
    Circle(double radius){
        this.radius=radius;
    }
    //Display method
    void displayDetails(){
        System.out.println("Radius: " +radius);
    }
}
public class CircleRadius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Create an object for default
        System.out.println("Default value: ");
        Circle calculate=new Circle();
        calculate.displayDetails();
        //take input from users
        double radius=sc.nextDouble();
        //create an object for circle class
        Circle calculate1=new Circle(radius);
        calculate1.displayDetails();
    }
}
package Level1;

import java.util.Scanner;
class Person {
    //Attributes
    String name;
    int age;
    // parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }//copy constructor
    Person(Person personDetails) {
        this.name = personDetails.name;
        this.age = personDetails.age;
    }
    //Display method
    void displayPersonDetails() {
        System.out.println("Person name: "+ name + " Person's age: "+ age );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take inputs from users
        String name = sc.next();
        int age=sc.nextInt();
        //Create object for Parameterized constructor
        Person obj = new Person(name,age);
        obj.displayPersonDetails();
        //Create object for copy constructor
        Person obj1=new Person(obj);
        obj1.displayPersonDetails();
    }
}
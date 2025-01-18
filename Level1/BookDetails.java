package Level1;

import java.util.Scanner;

class Book{
    //Attributes
    String title;
    String author;
    double price;
    //Default constructor
    Book(){
        title="Harry Potter";
        author="J.K Rowling";
        price=100.0;
    }
    //Constructor
    Book(String title,String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //Display method
    void displayBookDetails(){
        System.out.println("Title of the book: " +title + ", Author name: " +author +", Price: "+ price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //create object for default constructor
        Book obj1=new Book();
        System.out.println("obj1 ");
        obj1.displayBookDetails();
        //Take inputs from users
        String title=sc.next();
        String author=sc.next();
        double price=sc.nextInt();
        //Create object for Book class
        Book obj=new Book(title,author,price);
        obj.displayBookDetails();
    }
}
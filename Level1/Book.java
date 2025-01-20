package Level1;

public class Book {
    static String libraryName="Learning route";//static variable
    String title;
    String author;
    final int isbn;//final variable
    //static method to display library name
       static void displayLibraryName(){
    System.out.println(libraryName);
}
    //constructor
    Book(String title, String author, final int isbn){
    this.title=title;
    this.author=author;
    this.isbn=isbn;
}
    //method to display details
    void displayBookDetails(){
        //check if an obj object is an instance of Book
    if(this instanceof Book){
        System.out.println("Library name: "+libraryName);
        System.out.println("title" + title);
        System.out.println("Author name: "+ author);
        System.out.println("Isbn: " +isbn);
    }else{
        System.out.println("not in this library");
    }
}

    public static void main(String[] args) {
        //create objects
        Book obj=new Book("Harry potter","J.k rowling",234);
        Book obj1=new Book("Half girlfriend", "Chetan bhagat", 123);
        //calling display method by using object
        obj.displayBookDetails();
        obj1.displayBookDetails();
    }

}

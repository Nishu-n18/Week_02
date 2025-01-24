package level1;
class Book{
    protected String title;
    protected int publicationYear;
    //Constructor
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    //Method to display info
    void displayInfo(){
        System.out.println("Title: "+ title+ " Publication year "+ publicationYear);
    }
}
//subclass author
class Author extends Book{
    private String name;
    private String bio;
    //Constructor
    Author(String title, int publicationYear,String name,String bio) {
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    //Method to display info
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println(" Author Name: "+name +" Bio: "+bio);
    }
}
//Main class library management
public class LibraryManagement {
    public static void main(String[] args) {
        //create an object of class author
        Author author=new Author("Harry potter",1997,"J.k rowling","She is from England");
        System.out.println("Book details with author");
        //display info
        author.displayInfo();
    }
}

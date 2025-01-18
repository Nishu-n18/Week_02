package Level1;

import java.util.Scanner;

public class HotelBooking {
    //Attributes
    String guestName;
    String roomType;
    int nights;
    //Default constructor
    HotelBooking(){
        guestName="Regular";
        roomType="Non-ac";
        nights=1;
    }
    //Parameterized constructor
    HotelBooking(String guestName,String roomType,int nights) {
        this.guestName = guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    //Copy constructor
    HotelBooking(HotelBooking book){
        this.guestName= book.guestName;
        this.roomType= book.roomType;
        this.nights= book.nights;
    }
    // Display method
    void displayDetails(){
        System.out.println(" GuestName: "+ guestName+ " RoomType: " +roomType +" nightStay: "+ nights);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Create object for default values
        HotelBooking book1=new HotelBooking();
        book1.displayDetails();
        //Take input from users
        String guestName=sc.next();
        String roomType=sc.next();
        int nights=sc.nextInt();
        //Create object for parameterized
        HotelBooking book2=new HotelBooking(guestName,roomType,nights);
        book2.displayDetails();
        //Create object for copy constructor
        HotelBooking book3=new HotelBooking(book2);
        book3.displayDetails();
    }

}

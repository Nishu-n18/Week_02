package Level2;

import java.util.Scanner;

class PalindromeChecker{
     //Attribute
     String text;
     //constructor
     PalindromeChecker(String text){
         this.text=text;
     }//Method to check text is palindrome or  not
     public boolean palindromeCheck() {
         int i = 0;
         int j = text.length() - 1;
         while (j > i) {
             if (text.charAt(i) != text.charAt(j)) {
                 return false;
             }
             i++;
             j--;
         }
         return true;
     }
}
public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        //create object for palindromeChecker class
        PalindromeChecker obj=new PalindromeChecker(text);
        if(obj.palindromeCheck()){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}

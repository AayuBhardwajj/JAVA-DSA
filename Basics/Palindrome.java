//package JAVA-DSA.Basics;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the input: ");
        int a= s.nextInt();
        checkForPalindrome(a);
        
    }
    public static void checkForPalindrome(int a){
        int revnum=0;
        int dup=a;
        while(a>0){
            int lastDigit=a%10;
            a/=10;
            revnum=(revnum*10)+lastDigit;
        }
        if(revnum==dup){
            System.out.println("Yes, "+dup+" is a palindrome numnber");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}

package String;
import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your String input: ");
        String str=s.nextLine();
        System.out.println(checkPalindrome(str));


    }
    public static boolean checkPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i)!=str.charAt(n-1-i)){   
            return false;
        }
            }
            return true;
        }
    }


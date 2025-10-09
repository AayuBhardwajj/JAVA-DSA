package Recursion;
import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the integer input for factorial: ");
        int n=s.nextInt();
        System.out.println("The factorial of"+n+" is: "+fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm=fact(n-1);
        int fn=n*fnm;
        return fn;
    }
}
//package JAVA-DSA.Basics;
import java.util.*;
public class Digit {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the integer input: ");
        int a=s.nextInt();
        int count=0;
        while(a>1){
            a/=10;
            count++;
        }
        System.out.println(count);
    }
}

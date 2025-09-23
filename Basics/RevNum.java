//package JAVA-DSA.Basics;
import java.util.*;
public class RevNum {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the integer input: ");
        int a=s.nextInt();
        int revernum=0;
        while(a>1){
            int lastDigit=a%10;
                a/=10;
                revernum=(revernum*10)+lastDigit;
        }
        System.out.println(revernum);
    }
}

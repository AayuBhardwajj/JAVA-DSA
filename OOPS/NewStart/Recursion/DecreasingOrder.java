package Recursion;
import java.util.*;
public class DecreasingOrder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the integer input ");
        int input=s.nextInt();
        printRev(input);
    }
    public static void printRev(int input){
        if(input==0){
            System.out.println(input);
            return;
        }
        System.out.println(input+" ");
        printRev(input-1);
    }
}

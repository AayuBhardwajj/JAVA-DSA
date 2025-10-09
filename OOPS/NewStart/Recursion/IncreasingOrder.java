package Recursion;
import java.util.*;
public class IncreasingOrder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the integer input: ");
        int input=s.nextInt();
        printIncreasingOrder(input);
    }
    public static void printIncreasingOrder(int input){
        if(input==1){
            System.out.println(input+" ");
            return;
        }
        printIncreasingOrder(input-1);
        System.out.println(input+" ");
    }
}

package Recursion;
import java.util.*;
public class DecreasingOrder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the integer input ");
        int input=s.nextInt();
        //printRev(input);
        printFron(input);
    }
    public static void printRev(int input){
        if(input==0){
            System.out.println(input);
            return;
        }
        System.out.print(input+" ");
        printRev(input-1);
    }

    public static void printFron(int input){
        if(input==0){
            return;
        }
        printFron(input-1);
        System.out.println(input);
    }
}

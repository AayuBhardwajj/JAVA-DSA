package Arrays;
import java.util.*;
public class Alternates {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Alternate elements are: ");
        printAlt(arr, 0, size);
    
    }
    public static void printAlt(int arr[], int i, int size){
        if(i>size){
            return;
        }
        System.out.print(arr[i]+" ");

        printAlt(arr, i+2, size);
    }
}
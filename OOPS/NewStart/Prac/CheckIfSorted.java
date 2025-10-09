package NewStart.Prac;
import java.util.*;
public class CheckIfSorted {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= s.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printArray(arr);
        System.out.println();
        System.out.print(checkSort(arr));

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position "+i+" is: "+arr[i]);
        }
    }
    public static boolean checkSort(int arr[]){
        boolean cond=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}

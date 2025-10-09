package Recursion;
import java.util.*;
public class SortedArray{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the requried size of Array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        boolean x=checkForSorted(arr, 0);
        if(x==true){
            System.out.println("It is a sorted array");
        }
        else{
            System.out.println("It aint a sorted array");
        }
    }
    public static boolean checkForSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checkForSorted(arr, i+1);
    }
}
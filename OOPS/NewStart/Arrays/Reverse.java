package NewStart.Arrays;
import java.util.*;
public class Reverse {
    public static void main(String args[]){
       Scanner s= new Scanner(System.in);
       System.out.println("Enter the size of array: ");
       int a=s.nextInt();
       int arr[]=new int [a];
       System.out.println("Enter the "+a+" element: ");
       for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
       }
       printArray(arr);
       revtheArray(arr);
       printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("ELement entered at position "+i+" is: "+arr[i]);
        }
    }
    public static void revtheArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
}

package NewStart.Prac;
import java.util.*;
public class ArrayRev {
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
        arrayRevv(arr);
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position [ "+i+" ] is: "+arr[i]);
        }
    }
    public static void arrayRevv(int arr[]){
        int start=0;
        int end=arr.length-1;
        System.out.println("After reversing the array");
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

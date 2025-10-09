package NewStart.Prac;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the number of "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        printArray(arr);
        System.out.println("Enter the element you wanna find out: ");
        int r= s.nextInt();
        System.out.println("The element "+r+" is found on position: "+binSearch(arr, r));
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Array element entered at position [ "+i+" ] is: "+arr[i]);
        }
       
    }
    public static int binSearch(int arr[], int r){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==r){
                return mid;
            }
            else if(arr[mid]>r){
               end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}

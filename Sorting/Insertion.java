package Sort;
import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printAr(arr);
        System.out.println("After the insertion sort");
        System.out.println();
        InsertionSort(arr);
        System.out.println();
        printAr(arr);
    }
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int previous=i-1;
            while(previous>=0 && current<arr[previous]){ // reverse the sign for descending order
            arr[previous+1]=arr[previous];
            previous--;
            }
            arr[previous+1]=current;
        }

    }
    public static void printAr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position "+i+" is: "+arr[i]);
        }
        System.out.println();
    }
}

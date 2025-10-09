package Sort;
import java.util.*;
public class Selection {
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
        System.out.println("After the selection sort algo ");
        System.out.println();
        selectionSort(arr);
        System.out.println();
        printAr(arr);
    }
    public static void printAr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position ( "+i+" ) is: "+arr[i]);
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max]>arr[j]){
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }
    }
}

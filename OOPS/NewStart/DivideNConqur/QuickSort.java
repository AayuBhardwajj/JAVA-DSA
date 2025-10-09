package DivideNConqur;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printArr(arr);
        System.out.println();
        System.out.println("After implementing quick sort");
        System.out.println();
        QuickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void QuickSort(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int pix=partition(arr,start,end);
        QuickSort(arr,start,pix-1);
        QuickSort(arr, pix+1, end);
    }
    public static int  partition(int arr[],int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position ( "+i+" ) is: "+arr[i]);
        }
    }
}

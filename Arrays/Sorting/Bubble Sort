import java.util.*;
public class Bubble {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printAr(arr);
        bubbleSort(arr);
        System.out.println("Array after getting sorted: ");
        System.out.println();
        printAr(arr);
    
    }
    public static void bubbleSort(int arr[]){
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }
        System.out.println("Number of swaps happened: "+swap);
        System.out.println();
    }
    public static void printAr(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.println("Element entered at position "+i+" is: "+arr[i]);
        }
        System.out.println();
    }
}

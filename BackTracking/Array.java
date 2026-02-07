import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printArr(arr);
        bacT(arr, 0, 1);
        printArr(arr);
    }
    public static void bacT(int arr[],int i, int value){
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i]=value;
        bacT(arr, i+1, value+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position ( "+i+" ) is: "+arr[i]);
        }
    }
} 

import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.err.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printArr(arr);
        System.out.println();
        mergeSortt(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void mergeSortt(int arr[],int start, int end){
        if(start<end){
        int mid=start+(end-start)/2;
        mergeSortt(arr, start, mid);
        mergeSortt(arr, mid+1, end);
        sortAll(arr, start, mid, end);
    }
}
    public static void sortAll(int arr[],int start,int mid, int end){
        int temp[]=new int[(end-start)+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
            while(i<=mid){
                temp[k++]=arr[i++];
            }
            while(j<=end){
                temp[k++]=arr[j++];
            }
            for(i=start,k=0;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }
}
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position ( "+i+" ) is: "+arr[i]);
        }
    }
}

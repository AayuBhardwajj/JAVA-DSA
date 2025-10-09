package NewStart.Arrays;
import java.util.*;

public class Nrot {
   public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    int arr[]={1,2,3,4,5,6,7};
    System.out.println("Enter the number of required rotations: ");
    int r=s.nextInt();
    int rq=r%arr.length;
    //rtAr(arr, rq);
    rev(arr, 0, arr.length-1);
    rev(arr, 0, rq-1);
    rev(arr, rq, arr.length-1);
    printArray(arr);
   }

   public static void rtAr(int arr[], int rq){
    int temp[]= new int[rq];
    for(int i=0;i<rq;i++){
        temp[i]=arr[i];
    }
    for(int i=rq;i<arr.length;i++){
        arr[i-rq]=arr[i];
    }
    for(int i=arr.length-rq;i<arr.length;i++){
        arr[i]=temp[i-(arr.length-rq)];
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   } 
   public static void rev(int arr[], int start, int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
   }
   public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   }
   
}
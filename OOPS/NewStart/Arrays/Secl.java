package NewStart.Arrays;
import java.util.*;

import NewStart.Prac.sec;
public class Secl {
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int size=s.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the "+size+" elements in array: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
    }
    System.out.println("Array formed: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    findSecondLargest(arr, size);
    System.out.println();
    findThirdLargest(arr, size);
}
public static void findSecondLargest(int arr[], int size){
    int largest=Integer.MIN_VALUE;
    int secLargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secLargest=largest;
            largest=arr[i];
        }else if(arr[i]<largest && arr[i]>secLargest){
            secLargest=arr[i];
        }
    }
    System.out.println("The largest element is: "+largest);
    System.out.println("The second largest element is: "+secLargest);
}
public static void findThirdLargest(int arr[],int size){
    int largest=Integer.MIN_VALUE;
    int secL=Integer.MIN_VALUE;
    int thirdL=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            thirdL=secL;
            secL=largest;
            largest=arr[i];
        }else if(arr[i]>secL && arr[i]!=largest){
            thirdL=secL;
            secL=arr[i];
        }else if(arr[i]>thirdL && arr[i]!=largest && arr[i]!=secL){
            thirdL=arr[i];
        }
    }
    System.out.println("The largest element in array is: "+largest);
    System.out.println("The second largest element in array is: "+secL);
    System.out.println("The third largest element in array is: "+thirdL);
}
}

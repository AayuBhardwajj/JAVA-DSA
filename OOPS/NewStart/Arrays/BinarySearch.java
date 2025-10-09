import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int a=s.nextInt();
        int arr[]= new int[a];
        System.out.println("Enter the "+a+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at positon "+i+" is: "+arr[i]);
        }
        System.out.println("Enter the value you wanna find out: ");
        int y=s.nextInt();
       System.out.println(bS(arr, y));
    }
    public static int bS(int arr[], int y){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==y){
            return mid;
        }
        else if(arr[mid]>y){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;
}
}
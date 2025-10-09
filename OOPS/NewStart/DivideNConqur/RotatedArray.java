package DivideNConqur;
import java.util.*;

public class RotatedArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element whose index you wanna find: ");
        int target=s.nextInt();
        int x=fidT(arr, 0, arr.length-1, target);
        System.out.println(x);
    }
    public static int fidT(int arr[],int start, int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
        if(arr[start]<=target && target<=arr[mid]){
            return fidT(arr, start, mid-1, target);
        }
        else{
            return fidT(arr, mid+1, end, target);
        }
    }
     else{
        if(arr[mid]<=target && target<=arr[end]){
            return fidT(arr, mid+1, end, target);
        }
        else{
            return fidT(arr, start, mid-1, target);
        }
    }
}

}

package BinarySearch;
import java.util.*;
public class Fnlo {
    public static void main(String[] args){
        int arr[]={2,4,6,8,8,8,11,13};
        int x=8;
        int first=lb(arr, x);
        int last=ub(arr, x)-1;
        if((first==arr.length)||(arr[first]!=x)){
            System.out.println("[ -1, -1 ]");
        }else{
            System.out.println( Arrays.toString(new int[]{first,last}));
        }
    }
    public static int lb(int arr[],int x){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }

    public static int ub(int arr[],int x){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
   
}

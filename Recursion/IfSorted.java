package Recursion;

public class IfSorted {
    public static void main(String[] args){
        int arr[]={1,2,3,47,5,6,7};
        System.out.println(isSorted(arr, 6));
    }
    public static boolean isSorted(int arr[],int n){
        if(n==0 || n==1){
            return true;
        }
        if(arr[n-1]<arr[n-2]){
            return false;
        }
        return isSorted(arr, n-1);
    }
}
 
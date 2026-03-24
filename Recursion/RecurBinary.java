package Recursion;

public class RecurBinary {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        recursiveBinarySearch(arr, 0, arr.length-1, 8);

    }
    public static void recursiveBinarySearch(int arr[],int start,int end, int target){
        if(start<=end){
            int mid= (start+end)/2;

            if(arr[mid]==target){
                System.out.println(target+" found at position: "+mid);
                return ;
            }else if(arr[mid]>target){
                recursiveBinarySearch(arr, start, mid-1, target);
            }else{
                recursiveBinarySearch(arr, mid+1, end, target);
            }
        }else{
        System.out.println("-1");        
    }
}
}

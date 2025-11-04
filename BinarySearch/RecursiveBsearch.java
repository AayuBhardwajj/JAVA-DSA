package BinarySearch;

public class RecursiveBsearch {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=14;
        System.out.println(bSearch(arr, 0, arr.length-1, target));
    }
    public static int bSearch(int arr[], int start, int end,int target){
        if(start>end)
            return -1;
        
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                return bSearch(arr, start, mid-1, target);
            }else{
                return bSearch(arr, mid+1, end, target);
            }
        }
        return 1;
    }
}

package BinarySearch;

public class Rbs {
   public static void main(String[] args){
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
    int target=2;
    System.out.println("Element "+target+" found at position: "+bSR(arr, target, 0, arr.length-1));
   }
   public static int bSR(int arr[], int target, int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                return bSR(arr, target, start, mid-1);
            }else{
                return bSR(arr, target, mid+1, end);
            }
        
   }
}

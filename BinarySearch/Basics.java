package BinarySearch;

public class Basics {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target=4;
        System.out.println(findTheIndexOfTarget(arr, target));
    }
    public static int findTheIndexOfTarget(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(target+" found at index: "+mid);;
               return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}

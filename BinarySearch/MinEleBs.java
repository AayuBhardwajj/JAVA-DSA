package BinarySearch;

public class MinEleBs {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int arr[]){
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[mid]){
                min=Math.min(min, arr[start]);
                start=mid+1;
            }else{
                end=mid-1;
                min=Math.min(min, arr[mid]);
            }
        }
        return min;
    }
}

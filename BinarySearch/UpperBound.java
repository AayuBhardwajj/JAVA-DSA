package BinarySearch;

public class UpperBound {
    public static void main(String[] args){
        int arr[]={2,3,6,7,8,8,11,11,11,12};
        int x=9;
        uB(arr, x);
    }
    public static void uB(int arr[],int x){
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(ans);
    }
}

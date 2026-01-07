package BinarySearch;

public class PeakBs {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,5,1};
        findPeakB(arr);
    }
    public static void findPeakB(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        System.out.println(arr[start]);
    }
}

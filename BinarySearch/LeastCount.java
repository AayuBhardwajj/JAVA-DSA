package BinarySearch;

public class LeastCount {
    public static void main(String[] args){
        int arr[]={1,2,3,3,7,8,9,9,9,11};
        int x=9;
        System.out.println(findLeastOccurance(arr, x));
    }
    public static int findLeastOccurance(int arr[],int x){
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                ans=mid;
                end=mid-1;
            }else if(arr[mid]>x){
                end=mid-1; 
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}

package BinarySearch;

public class FindOcc {
    public static void main(String[] args){
        
        int arr[]={1,2,2,2,2,3,4,5,6};
        int x=2;
        int start=lowerBound(arr, x);
        int end=upperBound(arr, x);
        int answer= end-start;
        if(start==arr.length || arr[start]!=x){
            System.out.println("0");
            return;
        }
        System.out.println(answer);
    }
    public static int lowerBound(int arr[],int x){
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;
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
     public static int upperBound(int arr[],int x){
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
        return ans;
    }
}

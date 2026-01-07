package BinarySearch;
public class SingleNum {
    public static void main(String[] args){
        int arr[]={1,1,2,3,3,4,4,8};
        findSingleNum(arr);
    }
    public static void findSingleNum(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            
            if(mid%2!=0){
                mid--;
            }

            if(arr[mid]==arr[mid+1]){
                start=mid+2;
            }else{
                end=mid;
            }
        }
        System.out.println(arr[start]);
    }
}

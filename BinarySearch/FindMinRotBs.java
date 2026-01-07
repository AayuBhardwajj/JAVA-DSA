package BinarySearch;

public class FindMinRotBs {
    public static void main(String[] args){
        int arr[]={3,4,5,1,2};
        System.out.println(findMinRot(arr));
    }
    public static int findMinRot(int arr[]){

        int start=0;
        int end=arr.length-1;
        int minInd=0;
        int min=Integer.MAX_VALUE;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(arr[start]<=arr[end]){
                if(arr[start]<min){
                min=arr[start];
                minInd=start;
            }

            break;
            }

            if(arr[start]<=arr[mid]){

                if(arr[start]<min){
                min=arr[start];
                minInd=start;
            }

            start=mid+1;
            
        }
            else{
                if(arr[mid]<min){
                    min=arr[mid];
                    minInd=mid;
                }
                end=mid-1;
            }
        }
        return minInd;
    }
}

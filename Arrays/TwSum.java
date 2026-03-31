package Arrays;
import java.util.*;
public class TwSum {
    public static void main(String[] args){
        int arr[]={2,7,11,15};
        int target=22;
        //System.out.println(Arrays.toString( sumT(arr, target)));
        System.out.println(Arrays.toString( twoPoint(arr, target)));
    }
    public static int[] sumT(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static int[] twoPoint(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int sum=arr[start]+arr[end];
                if(sum==target){
                    return new int[] {start, end};
                }else if(sum>target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return new int[]{-1,-1};
    }
}

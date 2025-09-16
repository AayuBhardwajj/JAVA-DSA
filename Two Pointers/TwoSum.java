//package JAVA-DSA.Two Pointers;

public class TwoSum {
    public static void main(String[] args){
        int arr[]={2,7,11,15};
        int target =9;
        //findS(arr,target);
        int result[]= findSA(arr, target);
        if(result.length==0){
            System.err.println("No 2 array elements adds upto the target sum");
        }else{
            System.out.println((result[0]+1)+" "+(result[1]+1));
        }
    }
    public static void findS(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
             int sum=arr[start]+arr[end];
            if(sum==target){
                System.out.println((start+1)+" "+(end+1));
                return;
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        } 
    }
    public static int[] findSA(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                return new int[]{start,end};
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return new int []{};
    }

}
         
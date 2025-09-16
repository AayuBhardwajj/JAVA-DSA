//package JAVA-DSA.Two Pointers;

public class TwoSum {
    public static void main(String[] args){
        int arr[]={2,7,11,15};
        int target =9;
        findS(arr,target);
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
}
         
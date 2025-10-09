package Prac;

public class Qtt {
    public static void main(String[] args){
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int target=3;
        findSubArray(arr, target);
    }
    public static void findSubArray(int arr[], int target){
        int len=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
               sum+=arr[j];
               if(sum==target){
                len=Math.max(len, j-i+1);
               }
            }
        }
        System.out.println(len);
    }
}

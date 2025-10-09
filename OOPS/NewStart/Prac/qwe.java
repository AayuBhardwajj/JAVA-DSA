package Prac;

public class qwe {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=7;
        findTarget(arr, target);
    }
    public static void findTarget(int arr[], int target){
        int start=0;
        int end=0;
        int sum=0;
        int max=0;
        while(end<arr.length){
            sum+=arr[end];

            while(sum>target && start<=end){
                sum-=arr[start];
                start++;
            }

            if(sum==target){
                max=Math.max(max, end-start+1);
            }
            end++;
        }
        System.out.println(max);
    }
}


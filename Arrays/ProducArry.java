package Arrays;


public class ProducArry {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        findp(arr);
    }
    public static void findp(int arr[]){
        int nums[]=new int [arr.length];
        nums[0]=1;
        for(int i=1;i<arr.length;i++){
            nums[i]=nums[i-1]*arr[i-1];
            }
            int right=1;
            for(int j=arr.length-1;j>=0;j--){
                nums[j]=nums[j]*right;
                right=right*arr[j];
            }
            for(int x: nums){
            System.out.println(x);
        }
    }
}


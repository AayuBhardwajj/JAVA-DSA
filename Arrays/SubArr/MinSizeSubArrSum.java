package SubArr;
public class MinSizeSubArrSum{
    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3};
        int target=7;
        //findMinLength(arr, target);
        optmized(arr, target);
    }
    public static void findMinLength(int arr[],int target){
        int minlength=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(sum>=target){
                    int length= j-i+1;
                    minlength=Math.min(length, minlength);
                    break;
                }
            }
        }
        System.out.println(minlength);
    }

    public static void optmized(int arr[], int target){
        int left=0;
        int minL=Integer.MAX_VALUE;
        int sum =0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];

            while(sum>=target){
                int length= right-left+1;
                minL=Math.min(length, minL);
                sum-=arr[left];
                left++;
            }
        }
        if(minL==Integer.MAX_VALUE){
            System.out.println("0");
        }else{
            System.out.println(minL);
        }
    }
}
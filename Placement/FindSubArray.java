public class FindSubArray {
    public static void main(String[] args){
        int arr[]={1,2,3};
        int target=3;
        findSubArrSum(arr, target);
    }
    public static void findSubArrSum(int arr[], int target){
          int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==target){
                        count++;
                    }
            }
        } 
        System.out.println(count);
    }
}

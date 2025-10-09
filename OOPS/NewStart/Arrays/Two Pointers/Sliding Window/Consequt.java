
public class Consequt {
    public static void main(String[] args){
        int arr[]={6,2,3,4,7,2,1,7,1};
        int k=4;
        //findMaxSum(arr, k);
        xyz(arr, k);
    }   
    public static void findMaxSum(int arr[], int k){
        int lSum=0;
        int rSum=0;
        int max=0;
        for(int i=0;i<k;i++){
            lSum+=arr[i];
            max=lSum;
        }
        int rInd=arr.length-1;
        for(int i=k-1;i>=0;i--){
            lSum-=arr[i];
            rSum+=arr[rInd];
            rInd--;
            max=Math.max(max, lSum+rSum);
        }
        System.out.println(max);
    }

    public static void xyz(int arr[],int k){
        int maxS=0;
        int lsum=0;
        int rsum=0;
        for(int left=0;left<k;left++){
            lsum+=arr[left];
            maxS=lsum;
        }
        int right=arr.length-1;
        for(int left=k-1;left>=0;left--){
            lsum-=arr[left];
            rsum+=arr[right];
            right--;
             maxS=Math.max(maxS, lsum+rsum);
        }

       

        System.out.println(maxS);
    }
}

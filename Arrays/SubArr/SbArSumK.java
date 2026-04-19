package SubArr;

public class SbArSumK {
    public static void main(String[] args){
        int arr[]={1,-1,0,1,2,-1,3};
        int k=3;
        findSm(arr, k);
    }
    public static void findSm(int arr[], int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

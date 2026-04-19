package SubArr;
public class SbArS {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        findProductOfSubArray(arr);
        findSumOfSubArray(arr);
    }
    public static void findSumOfSubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=i;j<arr.length;j++){
                s+=arr[j];
                System.out.println("Sum: "+s);
            }
        }
    }

    public static void findProductOfSubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int p=1;
            for(int j=i;j<arr.length;j++){
                p*=arr[j];
                System.out.println("Product :"+p);
            }
        }
    }
}

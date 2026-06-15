package Placement
public class FindPivot{
    public static void main(String[] args){
        int arr[]={1,7,3,6,5,6};
        System.out.println(findP(arr));
    }
    public static int findP(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int leftS=0;
        for(int i=0;i<arr.length;i++){
            int rightSum=sum-leftS-arr[i];
            if(leftS==rightSum){
                return i;
            }
            leftS+=arr[i];
        }
        return -1;
    }
}
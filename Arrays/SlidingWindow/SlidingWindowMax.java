package SlidingWindow;

public class SlidingWindowMax {
    public static void main(String[] args){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        findMaxSlw(arr, k);
    }
    public static void findMaxSlw(int arr[], int k){
        int temp[]= new int[arr.length-k+1];
        for(int i=0;i<arr.length-k+1;i++){
            int max=arr[i];
            for(int j=i;j<k+i;j++){
                max=Math.max(max, arr[j]);
            }
            temp[i]=max;
        }

        for(int x=0;x<temp.length;x++){
            System.out.print(temp[x]+" ");
        }
    }
}

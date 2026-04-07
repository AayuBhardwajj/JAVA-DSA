package SlidingWindow;

public class Max1KFlip {
    public static void main(String[] args){
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        //brute(arr, k);
        optimized(arr, k);
    }
    public static void brute(int arr[], int k){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int zC=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    zC++;
                }
                if(zC>k){
                    break;
                }
                max=Math.max(max, j-i+1);
            }
        }
        System.out.println(max);
    }

    public static void optimized(int arr[], int k){
        int maxS=0;
        int left=0;
        int zeroCount=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(arr[left]==0){
                    zeroCount--;
                }
                left++;
            }
            maxS=Math.max(maxS, right-left+1);
        }
        System.out.println(maxS);
    }
}

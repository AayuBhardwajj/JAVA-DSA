package Placement;

public class Stocks {
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        findMaxProfit(arr);
        findMaxProfitOptimized(arr);
    }
    public static void findMaxProfit(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int profit= arr[j]-arr[i];
                
            max=Math.max(max, profit);
        }
    }
    System.out.println(max);
}
    public static void findMaxProfitOptimized(int arr[]){
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min, arr[i]);
           // int profit= arr[i]-min;
            maxprofit=Math.max(maxprofit, arr[i]-min);
        }
        System.out.println(maxprofit);
    }
}

public class Stonks {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(findMaxProfit(arr));
    }
    public static int findMaxProfit(int arr[]){
        int maxprofit=0;
        int bP=Integer.MAX_VALUE;

        for(int i:arr){
            if(i>bP){
                int profit=i-bP;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                bP=i;
            }
        }
        return maxprofit;
    }
}

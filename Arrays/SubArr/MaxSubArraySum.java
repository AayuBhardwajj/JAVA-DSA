public class MaxSubArraySum {
    public static void main(String[] args){
        int arr[]={1,-2,6,-1,3};
        int cs=0;
        int maxS=0;
        for(int i:arr){
            cs+=i;
            maxS=Math.max(maxS, cs);
        }
        System.out.println(maxS);
    }
}

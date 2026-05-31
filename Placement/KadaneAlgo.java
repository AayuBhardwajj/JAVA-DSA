package Placement;

public class KadaneAlgo {
    public static void main(String[] args){
        int arr[]={10,3,-12, -6,-9, 7,2,7};
        int currS=0;
        int maxS=0;
        for(int i=0; i<arr.length;i++){
            currS+=arr[i];

            if(currS<0){
                currS=0;
            }
            maxS=Math.max(currS, maxS);
        }
        System.out.println(maxS);
    }
}

package SlidingWindow;
public class slw1 {
    public static void main(String[] args) {
        int arr[]={1,4,2,10,23,3,1,0,20};
        int l=arr.length;
        int k=4;
        //findMaxSub(arr, l, k);
        slid(arr, k, l);
    }
    public static void findMaxSub(int arr[], int l, int k){
        int maxS=0;
        for(int i=0;i<l-k+1;i++){ // initialise all the possible starting points of sub-arrays
            int sum=0;
            for(int j=i;j<k+i;j++){ // make sure all the k elements from different starting points are collected 
                sum+=arr[j];
            }
        
        maxS= Math.max(maxS, sum);
    }
    System.out.println(maxS);
}

    public static void slid(int arr[],int k, int l){
        int sls=0;
    
        for(int i=0;i<k;i++){
            sls+=arr[i];
        }
        int maxS=sls;
        for(int j=k;j<l;j++){
            sls+=arr[j];
            sls-=arr[j-k];
        
        maxS=Math.max(maxS, sls);
        }
        System.out.println(maxS);
    }

}

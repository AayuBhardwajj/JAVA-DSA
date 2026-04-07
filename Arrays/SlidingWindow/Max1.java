package SlidingWindow;

public class Max1 {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        //findMaxOnes(arr);
        optimized(arr);
    }
    public static void findMaxOnes(int arr[]){
        int maxs=0;
        int l=arr.length;
        for(int i=0;i<l;i++){
            int sum=0;
            for(int j=i;j<l;j++){
                if(arr[j]!=1){
                    break;
                }else{
                    sum++;
                }
            }
             maxs=Math.max(maxs, sum);
        }
        System.out.println(maxs);
    }

    public static void optimized(int arr[]){
        int count=0;
        int maxS=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxS=Math.max(maxS,count);
            }else{
                count=0;
            }
        }
        System.out.println(maxS);
    }
}

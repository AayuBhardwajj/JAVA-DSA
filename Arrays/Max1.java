public class Max1{
    public static void main(String args[]){
        int arr[]={0,1,1,3,1,3,1,1,1,1,4,5,1,1,1,1,1,1,1};
        findMaxOnes(arr);
    }
    public static void findMaxOnes(int arr[]){
        int count=0;
        int maxC=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxC=Math.max(maxC, count);
            }else{
                count=0;
            }
        }
         System.out.println(maxC);
    }
}
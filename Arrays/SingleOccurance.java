public class SingleOccurance {
    public static void main(String[] args){
        int arr[]={4,1,2,2,1};

        //brute(arr);
        xorApproach(arr);
    }
    public static void brute(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
             if(count==1){
                    System.out.println(arr[i]);
                }
        }
       
    }

     public static void xorApproach(int arr[]){
        int xor0=0;
        for(int i=0;i<arr.length;i++){
            xor0^=arr[i];
        }   
        System.out.println(xor0);
        }
}

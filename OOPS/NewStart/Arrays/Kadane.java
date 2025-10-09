package Arrays;

public class Kadane {
    public static void main(String args[]){
        int arr[]={12,3,-7,-8,6};
        Kadanee(arr);
    }
    public static void Kadanee(int arr[]){
        int max = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i=0;i<arr.length;i++){
            cs +=arr[i];
            
            if(cs< 0){
                cs = 0;
            }
            max=Math.max(cs, max);
        }
        System.out.println("Max subarray sum: "+max);
        
    }

    public static void kad(int arr[]){
        int max=Integer.MIN_VALUE;
        int cs=0;
        int st=-1;
        int end=-1;
        int start=-1;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs==0){
                start=i;

            }
            if(cs<0){
                cs=0;
            }
            if(cs>max){
                max=cs;
                st=i;
                end=
            }
        }
    }
}
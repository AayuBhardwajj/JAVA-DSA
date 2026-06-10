package Placement;
public class ReversePairs {
    public static void main(String[] args) {
        int arr[]={1,3,2,3,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if((arr[i]>2*arr[j]) && j>i){
                count++;
            }
        }
    }
    System.out.println(count);
    }
}
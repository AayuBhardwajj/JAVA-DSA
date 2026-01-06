package BinarySearch;

public class FindMin1 {
    public static void main(String[] args){
        int arr[]={3,4,5,1,2};
        System.out.println("Array was rotated: "+findRot(arr)+" times");
    }
    public static int findRot(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return -1;
    }
}

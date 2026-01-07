package BinarySearch;
public class FindMinRot{
    public static void main(String[] args){
        int arr[]={3,4,5,1,2};
        findRot(arr);
    }
    public static void findRot(int arr[]){
        int min=Integer.MAX_VALUE;
        int minInd=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                minInd=i;
            }
        }
        System.out.println("Array was rotated "+minInd+" times");
    } 
}

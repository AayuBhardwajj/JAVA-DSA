package BinarySearch;
import java.util.*;
    public class FirstNLastOcc{
    public static void main(String[] agrs){
    int arr[]={1,2,4,6,8,8,8,11,13};
    int x=8;
    System.out.println(Arrays.toString( findOc(arr, x)));
}
    public static int[] findOc(int arr[],int x){
        int first=-1;
        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        return new int[] {first,last};
}
    }
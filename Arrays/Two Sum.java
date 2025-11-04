package Arrays;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        Arrays.sort(arr);
        int target=14;
    System.out.println(brueteForce(arr,target));
    }
public static int[] brueteForce(int arr[],int target){
for(int i=0;i<arr.length;i++){
    
for(int j=i+1;j<arr.length;j++){
if(arr[i]+arr[j]==target){
return new int[] {i,j};
}
}
}
return new int[] {};
}
}


import java.util.Arrays;
import java.util.ArrayList;
public class ThreeSum {
    public static void main(String[] args){
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString( findThreeSum(arr)));
    }
    public static int[] findThreeSum(int arr[]){
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        return new int[]{i,j,k};
                    }
                }
            }
        }
        return new int[]{-1,-1,-1};
    }
}


import java.util.Arrays;
import java.util.HashMap;
public class Two_Sum{
    public static void main(String[] args){
        int arr[]={2,6,5,8,11};
        int target=14;
        System.out.println(Arrays.toString(TSum(arr, target)));
    }
    public static int[] TSum(int arr[], int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x= target- arr[i];
            if(hm.containsKey(x)){
                return new int[]{hm.get(x),i};
            }else{
                hm.put(arr[i], i);
            }
        }
        return new int[]{} ;
    }
}
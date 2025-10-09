package Arrays;
import java.util.*;
public class SubArrSum {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        Arrays.sort(arr);
        int target=14;

        int left=0;
        int right=arr.length-1;

        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Yes");
                return;
            }else{
                
            }
            if(sum<target){
                left++;
            } else{
                right--;
            }
        }
        System.out.println("No");

    }
}

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMapm<Integer , Integer> hm= new HashMap<>();
        
//         int sum=0;
//         int maxL=0;
//         for(int i: nums){
//             sum+=nums;

//             if(sum==k){
//                 maxL=i+1;
//             }

//             if(hm.getKey(sum-k)){
//                 maxL=Math.max(sum, hm.getKey(sum-k));
//             }
//             if(!hm.getKey(sum-k)){
//                 hm.put(sum,i);
//             }
//         }
//         return maxL;
//     }
// }
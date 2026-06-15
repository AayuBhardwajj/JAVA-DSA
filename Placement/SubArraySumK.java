package Placement;

import java.util.HashMap;

public class SubArraySumK {
    public static void main(String[] args) {
        int arr[]={1,1,1};
        int k=2;
        findSumOfSubArray(arr, k);
    }
    public static void findSumOfSubArray(int arr[], int k){
        int count=0;
        int sum=0;
        HashMap<Integer, Integer> hm= new HashMap<>();
        hm.put(0, 1);
        for(int i=0;i<arr.length;i++){
              sum+=arr[i];
            int x= sum-k;
            if(hm.containsKey(x)){
                count++;
            }else{
                hm.put(sum, hm.getOrDefault(0, 1)+1);
            }
          
        }
        System.out.println(count);
    }
}

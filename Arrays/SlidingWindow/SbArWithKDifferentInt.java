package SlidingWindow;
import java.util.HashSet;
import java.util.HashMap;
public class SbArWithKDifferentInt {
    public static void main(String[] args){
        int arr[]={1,2,1,3,4};
        int k=3;
        findGoodSubArrays(arr, k);
        int result=optimized(arr, k) - optimized(arr, k-1);
        System.out.println(result);
    }
    public static void findGoodSubArrays(int arr[],int k){
        int max=0;
        for(int i=0;i<arr.length;i++){
            HashSet <Integer> hs= new HashSet<>();
            for(int j=i;j<arr.length;j++){
            hs.add(arr[j]);

            if(hs.size()>k){
                break;
            }
            if(hs.size()==k){
                max++;
            }
        }
    }
     System.out.println(max);
}

    public static int optimized(int arr[], int k){
        int count=0;
        int j=0;
        HashMap<Integer, Integer> hm= new HashMap<>(); 
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);

            while(hm.size()>k){
                hm.put(arr[j], hm.get(arr[j])-1);
                if(hm.get(arr[j])==0){
                    hm.remove(arr[j]);
                }
                j++;
            }
           
                count+=(i-j+1);
        }
        return count;
    }
}



package SlidingWindow;
import java.util.HashSet;
import java.util.HashMap;
public class FruitsInBasket {
    public static void main(String[] args){
        int arr[]={1,1,2,1,3,3,3,3};
        int k=2;
        brute(arr, k);
        op(arr);
    }
    public static void brute(int arr[], int k){
        int minL=Integer.MIN_VALUE;
    
        for(int i=0;i<arr.length;i++){
             HashSet <Integer> hs= new HashSet<>();
            for(int j=i;j<arr.length;j++){
                hs.add(arr[j]);

                if(hs.size()>2){
                    break;
                }
                int length= j-i+1;
                    minL=Math.max(minL, length);
            }
        }
        System.out.println(minL);
    }

    public static void op(int arr[]){
        HashMap<Integer, Integer> hm= new HashMap<>();
        int left=0;
        int maxL=Integer.MIN_VALUE;
        for(int right=0;right<arr.length;right++){
            hm.put(arr[right], hm.getOrDefault(arr[right], 0)+1); // hm.put -> Adds a value n its frequency in hashmap
                                                                               // hm.getOrDefault-> checks in the map, the frequency of the element being mentioned
            while(hm.size()>2){
                hm.put(arr[left], hm.get(arr[left])-1);
                
                if(hm.get(arr[left])==0){
                    hm.remove(arr[left]);
                }
                left++;
            }
            maxL=Math.max(maxL, right-left+1);
        }
        System.out.println(maxL);
    }
    
}

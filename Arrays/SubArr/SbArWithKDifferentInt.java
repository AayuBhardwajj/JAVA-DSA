package SubArr;
import java.util.HashSet;
public class SbArWithKDifferentInt {
    public static void main(String[] args){
        int arr[]={1,2,1,3,4};
        int k=3;
        findGoodSubArrays(arr, k);
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
}

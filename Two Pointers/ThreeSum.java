import java.util.*;
public class ThreeSum {
    public static void main(String[] args){
        int arr[]={-1,0,1,2,-1,-4};
        Set<List<Integer>> St= new HashSet<>();
        int x=arr.length;
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                for(int k=j+1;k<x;k++){
                    if((arr[i]+arr[j]+arr[k])==0){
                        List<Integer> trip= Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(trip);
                        St.add(trip);
                    }
                }
            }
        }
        List<List<Integer>> fin= new ArrayList<>(St);
        System.out.println(fin);

    }
}

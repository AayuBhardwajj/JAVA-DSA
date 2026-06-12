import java.util.ArrayList;
import java.util.Arrays;

public class Sum4 {
    public static void main(String[] args) {
        int arr[]={1,0,-1,0,-2,2};
        System.out.println(find4Sum(arr));
    }
    public static ArrayList<ArrayList<Integer>> find4Sum(int arr[]){
        if(arr== null || arr.length<4){
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
                int start=j+1;
                int end=arr.length-1;
                while(start<end){
                    int sum=arr[i]+arr[j]+arr[start]+arr[end];
                    if(sum==0){
                        al.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[start],arr[end])));
                        start++;
                        end--;
                    
                    while(start<end && arr[start]==arr[start-1]){
                        start++;
                    }
                     while(start<end && arr[end]==arr[end+1]){
                        end--;
                    }
                }
                    else if(sum>0){
                        end--;
                    }else{
                        start++;
                    }
                    
                }
            }
        }
         return new ArrayList<>(al);
    }
   
}

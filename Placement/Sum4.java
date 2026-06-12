import java.util.ArrayList;
import java.util.Arrays;

public class Sum4 {
    public static void main(String[] args) {
        int arr[]={1,0,-1,0,-2,2};
        int arr1[]={2,2,2,2};
        int target=8;
        // System.out.println(find4Sum(arr,target));
        System.out.println(find4Sum(arr1, target));
    }
    public static ArrayList<ArrayList<Integer>> find4Sum(int arr[], int target){
        if(arr== null || arr.length<4){
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                continue;
            }
                int start=j+1;
                int end=arr.length-1;
                while(start<end){
                    int sum=arr[i]+arr[j]+arr[start]+arr[end];
                    if(sum==target){
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
                    else if(sum>target){
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

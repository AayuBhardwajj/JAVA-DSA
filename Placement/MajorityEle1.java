package Placement;
import java.util.HashMap;
public class MajorityEle1 {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,2,2,1,1};
        //findMajor(arr);
        better(arr);
        mooresVoting(arr);
    }
    public static void findMajor(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>arr.length/3){
                System.out.println(arr[i]);
                return;
            }
        }
    }

    public static void better(int arr[]){
        HashMap<Integer, Integer>hm= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        for(int k: hm.keySet()){
            if(hm.get(k) > arr.length/2){
                System.out.println(k);
            }
        }
    }

    public static void mooresVoting(int arr[]){
        int candiadate=0;
        int vote=0;
        for(int i=0;i<arr.length;i++){
            if(vote==0){
                candiadate=arr[i];
            }
            if(arr[i]==candiadate){
                vote++;
            }else{
                vote--;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candiadate){
                count++;
            }
        }

        if(count> arr.length/2){
        System.out.println(candiadate);
    }else{
        System.out.println("No majority element");
    }
}
}
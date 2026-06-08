package Placement;
import java.util.*;;
public class MajorityEle2 {
    public static void main(String[] args) {
        int arr[]={3,2,3};
        findMajorEle(arr);
        better(arr);
    }
    public static void findMajorEle(int arr[]){
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
                int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
    
        if(count> arr.length/3 && !al.contains(arr[i])){
            al.add(arr[i]);
        }    
    }
    System.out.println(al);
}

    public static void better(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        ArrayList <Integer> al = new ArrayList<>();
        for(int k : hm.keySet()){
            if(hm.get(k)> arr.length/3){
                al.add(k);
            }
        }
        System.out.println(al);
    }

    public static void mooreVoting(int arr[]){
        int count1=0;
        int ele1=0;
        int count2=0;
        int ele2=0;
        for(int i:arr){
             if(i==ele1){
                count1++;
            }else if(i==ele2){
                count2++;
            }else if(count1==0){
                ele1=i;
                count1=1;
            }else if(count2==0){
                ele2=i;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
    }
}

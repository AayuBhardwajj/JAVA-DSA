package Placement;
import java.util.*;
import java.util.HashMap;;
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
}
package Placement;

import java.util.HashSet;

public class DuplicateNum {
    public static void main(String[] args){
        int arr[]={1,3,4,4,2};
        findDup(arr);
        findDupBetter(arr);
    }
    public static void findDup(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
        
        if(count>1){
            System.out.println("Duplicate element is: "+arr[i]);
            return;
        }
    }
}

    public static void findDupBetter(int arr[]){
        HashSet<Integer> hm= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hm.contains(arr[i])){
                System.out.println(arr[i]);
                return;
            }
            hm.add(arr[i]);
        }
    }
}

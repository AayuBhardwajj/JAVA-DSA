
import java.util.*;


public class Int {
    public static void main(String[] args){
        int arr1[]={1,2,2,3,4};
        int arr2[]={2,3,4,5};
        //findIntersection(arr1, arr2);
        findIntersectionBetter(arr1, arr2);
        findIntersectionOptimized(arr1, arr2);
    }
    public static void findIntersection(int arr1[],int arr2[] ){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    if(arr1[i]!=arr1[i-1]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}

    public static void findIntersectionBetter(int arr1[], int arr2[]){
        HashMap<Integer, Integer> hm= new HashMap<>();
        ArrayList<Integer>al= new ArrayList<>();
        for(int i:arr1){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        for(int i: arr2){
            if(hm.containsKey(i)&& hm.get(i)>0){
                al.add(i);
            }
        }

        System.out.println(al);
    }

    public static void findIntersectionOptimized(int arr1[], int arr2[]){
        ArrayList<Integer>al= new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                al.add(arr1[i]);
                i++;
                j++;
        }else if(arr1[i]>arr2[j]){
            j++;
        }else{
            i++;
        }

    }
    System.out.println(al);
}
}

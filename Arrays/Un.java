
import java.util.*;
public class Un {
    public static void main(String[] args){
        int arr1[]={1,1,2,3,3,4,5};
        int arr2[]={4,4,5,5,6,7};
        int m= arr1.length;
        int n= arr2.length;
        findUnion(arr1, arr2, m, n);

    }
    public static void findUnion(int arr1[], int arr2[], int m, int n){
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0;i<m;i++){
            hm.add(arr1[i]);
        }
        for(int j=0;j<n;j++){
            hm.add(arr2[j]);
        }
        System.out.println(hm);
    }
}

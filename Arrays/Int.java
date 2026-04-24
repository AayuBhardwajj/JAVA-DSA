
import java.util.*;


public class Int {
    public static void main(String[] args){
        int arr1[]={1,2,2,3,4};
        int arr2[]={2,3,4,5};
        findIntersection(arr1, arr2);
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
}

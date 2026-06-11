import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Sum3{
    public static void main(String[] args){
        int arr[]={-1,0,1,2,-1,-4};
    System.out.println(S3(arr));
    }
    public static ArrayList<ArrayList<Integer>> S3(int arr[]){
        HashSet<ArrayList<Integer>> fin= new HashSet<>();
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    ArrayList<Integer> al= new ArrayList<>();
                    if(arr[i]+arr[j]+arr[k]==0){
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    Collections.sort(al);
                    fin.add(al);
                }
            }
        }
        
    }
    return new ArrayList<>(fin);
}
}
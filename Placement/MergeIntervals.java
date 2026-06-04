package Placement;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,4},{3,5},{6,7}};
        findMergeInterval(arr);
        optimizedMergeInterval(arr);
    }

    public static void findMergeInterval(int arr[][]){
        Arrays.sort(arr, (a, b)->a[0] - b[0]);
        ArrayList<int []> al= new ArrayList<>();    
        for(int i=0;i<arr.length;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            
            if(!al.isEmpty() && end <= al.get(al.size()-1)[1]){
                continue;
            }

            for(int j=i+1;j<arr.length;j++){
                if(arr[j][0]<=end){
                    end=Math.max(end , arr[j][1]);
                }else{
                    break;
                }
        
        }
         al.add(new int[]{start,end});
    }
        for(int[] x:al){
            System.out.println(Arrays.toString(x));
        }
    }

    public static void optimizedMergeInterval(int arr[][]){
        Arrays.sort(arr, (a,b)-> a[0] - b[0]);
        ArrayList <int[]>al= new ArrayList<>();
        for(int x[]: arr){
            if(al.isEmpty()){
                al.add(x);
            }
            else if(x[0]>al.get(al.size()-1)[1]){
                al.add(x);
            }
            else{
                al.get(al.size()-1)[1]=
                Math.max(x[1], al.get(al.size()-1)[1]);
            }
        }
       for(int p[]:al ){
        System.out.println(Arrays.toString(p));
       }
    }
}

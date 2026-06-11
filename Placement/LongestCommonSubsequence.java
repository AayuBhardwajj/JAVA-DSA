package Placement;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        int arr[]={100,4,200,1,3,2};
        System.out.println(longestCommon(arr));
    }
    public static int longestCommon(int arr[]){ // brute force
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int count=1;
        int longest=1;

       for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            continue;
        }
        if(arr[i]==arr[i-1]+1){
            count++;
        }else{
            count=1;
        }
        longest=Math.max(longest, count);
       }
        return longest;
    }
}

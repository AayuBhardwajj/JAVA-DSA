package HashMap;
import java.util.*;
public class NumHash {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int arr[]={1,3,5,6,2,1,3,5,2};

        int hash[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("Enter the digit whos frequency you wanna find out: ");
        int a=s.nextInt();
        System.out.println("Frequency of "+a+" is : "+hash[a]);
    }
}

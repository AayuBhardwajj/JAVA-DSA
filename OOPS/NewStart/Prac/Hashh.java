package Prac;
import java.util.*;
public class Hashh{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int arr[]={1,2,1,7,2,9,5,2};
        
        int hash[]=new int[14];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }

        System.out.println("Enter the element whose frequency you wanna find out: ");
        int a=s.nextInt();
        System.out.println("Frequency of "+a+" is: "+hash[a]);
    }
}
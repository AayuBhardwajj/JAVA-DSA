package Prac;
import java.util.*;
public class Hash1 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){
             System.out.print("Enter the element at index [ "+i+" ] ");
        arr[i]=s.nextInt();
        }
        System.out.println();
         System.out.println("The array formed is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int hash[]=new int [14];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]] +=1;
        }
        System.out.println("Enter the number of elemnts you wanna search: ");
        int num=s.nextInt();
        while(num-->0){
            System.out.println("Enter the elements you wanna search: ");
            int x=s.nextInt();
            System.out.println("The frequency of "+x+ " is: "+hash[x]);
        }
    }
}

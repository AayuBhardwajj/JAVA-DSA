import java.util.*;
import java.util.Scanner;
public class LastOccurence {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element you wanna find: ");
        int key=s.nextInt();

       System.out.println(findLastOcc(arr, key, 0));
    }
    public static int findLastOcc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int pq= findLastOcc(arr, key, i+1);
        if(pq==-1 && arr[i]==key){
            return i;
        }
        return pq;
    }
}

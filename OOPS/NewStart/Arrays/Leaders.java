import java.util.*;
public class Leaders {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the "+size+" elements for array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Array formed is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void findLeaders(int arr[]){
        int temp[]= new int[arr.length];
        int x;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr.length-1){
                temp[x]=arr[i];
            }
        }for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                temp[x]=arr[];
            }
        }
        
    }
}


import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element at position "+i+" : ");
            arr[i]=s.nextInt();
        }
        printArr(arr);
        System.out.println();
        removeDup(arr);

    }
    public static void removeDup(int arr[]){  
        int x=0;
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<x;j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(j==x){
                arr[x]=arr[j];
                x++;
            }
        }
        System.out.println("The array formed after removing the duplicate: ");
       for(int i=0;i<x;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public static void dupOptimized(int arr[]){
        Arrays.sort(arr);
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                arr[x]=arr[i];
                x++;
            }
        }
        System.out.println("The array formed after removing duplicates: ");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position "+i+" is: "+arr[i]);
        }
    }
}

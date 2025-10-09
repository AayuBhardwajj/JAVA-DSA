import java.util.*;
public class NonDup {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int[size];
        System.out.println("Start enetering the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printAR(arr);
        System.out.println();
        findDup(arr);
        

    }
    public static void printAR(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void findDup(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        }
    }


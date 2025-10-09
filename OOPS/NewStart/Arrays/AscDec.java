import java.util.*;
public class AscDec {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int[size];
        System.out.println("Start entering the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printArray(arr);
        System.out.println();
        if(checkIfAscending(arr)==true){
            System.out.println("Array is an Ascending Array");
        }else if(checkIfDescending(arr)==true){
            System.out.println("Array is a descending array");
        }else{
            System.out.println("Array is neither ascending or descending");
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static boolean checkIfAscending(int arr[]){
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return check;
}
     public static boolean checkIfDescending(int arr[]){
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return check;
}


}
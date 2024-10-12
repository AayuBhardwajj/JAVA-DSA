import java.util.*;
public class Lin {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= s.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printArray(arr);
        linearS(arr, 3);
        
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("ELement entered at position "+i+" is: "+arr[i]);
        }
    }
    public static void linearS(int arr[], int target){
        boolean x=false;
        for(int i=0;i<arr.length;i++){
             if (arr[i]==target){
                System.out.println(target+"  at position "+arr[i]);
                x=true;
                break;
            }
            if(x==false){
                System.out.println("Element not found");
                break;
            }
        }
       
    }
}

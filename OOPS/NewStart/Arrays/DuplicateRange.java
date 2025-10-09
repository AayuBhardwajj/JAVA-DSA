package Arrays;
import java.util.*;
public class DuplicateRange {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the range: ");
        int range=s.nextInt();
        System.out.println(duplRange(arr, range));
    }
    public static boolean duplRange(int arr[],int range){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=i+range && j<range;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

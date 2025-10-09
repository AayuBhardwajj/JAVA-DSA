package Arrays;
import java.util.*;
public class InversionCount {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Inversion count is: "+inversionCountt(arr));
    }
    public static int inversionCountt(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    count++;
                }
            }
        }
        return count;
    }
}

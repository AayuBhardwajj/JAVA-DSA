package Arrays;
import java.util.HashSet;
public class DupRem {
    public static void main(String[] args){
        int arr[]={1,2,1,3,2,4,25};
        int qw=removeDuplicates(arr);
        printArray(arr, qw);

    }
    public static int removeDuplicates(int arr[]){
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int ind=0;
        for(int i: hs){
            arr[ind]=i;
            ind++;
        }
        return ind;
    }
    public static void printArray(int arr[], int x){
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}

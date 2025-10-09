import java.util.*;
public class Rrot {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("Enter the rotation required: ");
        int e=s.nextInt();
        int fr=e%arr.length;
       // rightRot(arr, fr);
        //printArray(arr);
        revArr(arr, 0, arr.length-1);
        revArr(arr, 0, fr-1);
        revArr(arr, fr, arr.length-1);
        printArray(arr);
    }
    public static void rightRot(int arr[], int fr) {
        if(fr==0){
            return;
        }
        int temp[]=new int[fr];
        for(int i=0;i<fr;i++){
            temp[i]=arr[arr.length-fr+i];
        }
        for(int i=arr.length-1;i>=fr;i--){
            arr[i]=arr[i-fr];
        }
        for(int i=0;i<fr;i++){
            arr[i]=temp[i];
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void revArr(int arr[], int start, int end){
    
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

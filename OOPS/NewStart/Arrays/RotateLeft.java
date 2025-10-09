package Arrays;
import java.util.*;
public class RotateLeft {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println("Enter the left rotation you require: ");
        int rot=s.nextInt();
        //leftRotate(arr, rot);
        rotateTheArray(arr, rot);
        printArray(arr);
    }
    public static void leftRotate(int arr[],int rot){
        int size=arr.length;
        int temp[]=new int[rot];

        for(int i=0;i<rot;i++){
            temp[i]=arr[i];
        }
        for(int i=rot;i<arr.length;i++){
            arr[i-rot]=arr[i];
        }
        for(int i=0;i<2;i++){
            arr[size-rot+i]=temp[i];
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void optRot(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateTheArray(int arr[],int rot){
        if(rot>arr.length){
            rot=rot%arr.length;
        }
        optRot(arr, 0, rot-1);
        optRot(arr, rot, arr.length-1);
        optRot(arr, 0, arr.length-1);
    }
}

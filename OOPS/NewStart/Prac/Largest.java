package NewStart.Prac;
import java.util.*;
public class Largest {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        printArray(arr);
        System.out.println();
        findLSL(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element entered at position "+i+" is: "+arr[i]);
        }
    }
    
    public static void findLSL(int arr[]){
        int largest=arr[0];
        int seconLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                seconLargest=largest;
                largest=arr[i];
            }
                else if(arr[i]<largest && arr[i]>seconLargest){
                    seconLargest=arr[i];
                }
        }
       System.out.println("The largest element is: "+largest);
       System.out.println("The second largest element is: "+seconLargest);
    }
}

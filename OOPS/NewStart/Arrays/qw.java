package NewStart.Arrays;
import java.util.*;
public class qw {
    /*public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of 1st array: ");
        int size1= s.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter the "+size1+" elements: ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the size of 2nd array: ");
        int size2=s.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter the "+size2+" elements: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }
        findel(arr1, arr2, 7);*/

        public static void main(String args[]){
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the size of first array: ");
            int size1=s.nextInt();
            System.out.println("Enter the size of second array: ");
            int size2=s.nextInt();
            int arr[][]= new int[size1][size2];
            System.out.println("Enter the elements: ");
            for(int i=0;i<size1;i++){
                for(int j=0;j<size2;j++){
                    arr[i][j]=s.nextInt();
                }
                
            }
            for(int i=0;i<size1;i++){
                for(int j=0;j<size2;j++){
                System.out.println("Element entered at position [ "+i+" , "+j+" ] = "+arr[i][j]);
            }
        }
        linSer(arr, size1, size2, 9);
    }
    public static boolean linSer(int arr[][],int size1, int size2, int target){
      
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(arr[i][j]==target){
                    System.out.println("Element is found at poisiton "+i+j);
                   break;
                }
                else{
                    System.out.println("element not found ");
                    break;
                }
            }
        }
        return false;
    }
}
   


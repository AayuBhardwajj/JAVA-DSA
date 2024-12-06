package Arrays;
import java.util.*;

public class SecondRow {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= s.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols= s.nextInt();
        int arr[][]= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Element entered at position "+i+" , "+j+" is: ");
                arr[i][j]=s.nextInt();
            }
        }
        printArray(arr, rows, cols);
        System.out.println();
        printTranspose(arr,rows,cols);
        System.out.println(findSUmOfMiddle(arr, rows, cols));
    }
    public static void printArray(int arr[][], int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Element entered at position "+i+" , "+j+" is: "+arr[i][j]);
            }
        }
    }
    public static void printTranspose(int arr[][], int rows, int cols){
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.println("Element entered at position "+j+" , "+i+" is: "+arr[j][i]);
            }
        }
    }
    public static int findSUmOfMiddle(int arr[][], int rows, int cols){
        int sum=0;
        if(rows<=1){
            System.out.println("Only one row exists");
        }
        else{
            for(int j=0;j<cols;j++){
                sum+=arr[1][j];
            }
        }
        return sum;
    }
}

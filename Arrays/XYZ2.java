import java.util.*;
public class XYZ2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= s.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols= s.nextInt();

        int[][] arr= new int[rows][cols];

        System.out.println("Start entering the "+(rows*cols)+" elements for your "+rows+" * "+cols+" matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=s.nextInt();
            }
        }
        printMatrix(arr, rows, cols);

        int n=rows*cols;
  

       optimal(arr, rows, cols, n);
       printMatrix(arr, rows, cols);

    }
    public static void printMatrix(int arr[][], int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void optimal(int arr[][], int rows, int cols, int n){
        for(int i=0;i<rows;i++){
            for(int j=i+1;j<cols;j++){
                swap(arr, i, j, j, i);
            }
        }
         reverseTheRows(arr, rows, cols);

    }
    public static void swap(int arr[][], int rows, int cols, int rows1, int cols1){
        int temp= arr[rows][cols];
        arr[rows][cols]=arr[rows1][cols1];
        arr[rows1][cols1]=temp;
        }

    public static void reverseTheRows(int arr[][],int rows, int cols){

        for(int i=0;i<rows;i++){
            int start=0;
            int end=cols-1;
            while(start<end){
                int temp=arr[i][end];
                arr[i][end]=arr[i][start];
                arr[i][start]=temp;
                start++;
                end--;
            }
        }
    }
}

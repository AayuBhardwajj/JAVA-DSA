package Arrays;
import java.util.*;
public class SetZeroes {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrix: ");
        int rows=s.nextInt();
        System.out.println("Enter the number of columns for the matrix: ");
        int cols=s.nextInt();
        int arr[][]= new int[rows][cols];
        //int arr[][]={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        System.out.println("Start entering the elements for your "+rows+" * "+cols+" matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=s.nextInt();
            }
        }
        printMatrix(arr, rows, cols);

        System.out.println();

        //brute(arr, rows, cols);

        //better(arr, rows, cols);
        optimal(arr, rows, cols);

        printMatrix(arr, rows, cols);
        
    }

    public static void  printMatrix(int arr[][], int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void brute(int arr[][], int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==0){
                    markRow(arr,rows,cols,i,j);
                    markCols(arr,rows,cols,i,j);
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
    }

    public static void markRow(int arr[][],int rows, int cols, int i, int j){
        for(i=0;i<rows;i++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }

     public static void markCols(int arr[][],int rows, int cols, int i, int j){
        for(j=0;j<rows;j++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }

    public static void better(int arr[][],int rows, int cols){
        int row[]=new int[rows];
        int col[]=new int[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==0){
                    row[i]=2;
                    col[j]=2;
                }
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(row[i]==2|| col[j]==2){
                    arr[i][j]=0;
                }
            }
        }
    }
    
    public static void optimal(int arr[][], int rows, int cols){
        int col0=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(arr[0][j]==0|| arr[i][0]==0){
                    arr[i][j]=0;
                }
            }
        }

        if(arr[0][0]==0){
            for(int j=0;j<cols;j++){
                arr[0][j]=0;
            }
        }

        if(col0==0){
            for(int i=0;i<rows;i++){
                arr[i][0]=0;
            }
        }
    }
}
